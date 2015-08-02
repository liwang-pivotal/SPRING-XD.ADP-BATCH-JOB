package io.spring.batch;

import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.FieldSet;

public class CustomItemWriter implements ItemWriter<FieldSet>, ItemStream{

	private FlatFileItemWriter<String> delegate;

	@Override
	public void write(List<? extends FieldSet> items) throws Exception {		
        System.out.println("**********************************************");
        System.out.println("      GOT A FILE!!!");
        System.out.println("**********************************************");
        
        for (FieldSet item : items) {
        	System.out.println(item);
        }
        
	}

	public void setDelegate(FlatFileItemWriter<String> delegate) {
		this.delegate = delegate;
	}

	@Override
	public void close() throws ItemStreamException {
		this.delegate.close();
	}

	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		this.delegate.open(executionContext);
	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		this.delegate.update(executionContext);
	}
}
