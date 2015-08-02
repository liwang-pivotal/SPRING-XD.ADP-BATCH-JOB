package io.spring.batch;

import io.spring.domain.Person;

import org.springframework.batch.item.ItemProcessor;
 
public class CustomItemProcessor implements ItemProcessor<Person, Person>{
 
    @Override
    public Person process(Person result) throws Exception {
        System.out.println("Processing result :"+result);
 
        /*
         * Only return results which are equal or more than 80%
         *
         */
        if(result.getPersonID() < 2){
            return null;
        }
 
        return result;
    }
 
}
