package io.spring.batch;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.support.SingleItemPeekableItemReader;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.util.Assert;

public class CustomItemReader implements ItemReader<FieldSet>, ItemStream {

	private SingleItemPeekableItemReader<FieldSet> delegate;

	/**
	 * @see org.springframework.batch.item.ItemReader#read()
	 */
	@Override
	public FieldSet read() throws Exception {
		FieldSet line = null;
			
		while ((line = this.delegate.read()) != null) {
			return line;
		}
		
		Assert.isNull(line, "No 'END' was found.");
		return null;
	}

	public void setDelegate(SingleItemPeekableItemReader<FieldSet> delegate) {
		this.delegate = delegate;
	}

	@Override
	public void close() throws ItemStreamException {
		this.delegate.close();
	}

	@Override
	public void open(ExecutionContext executionContext)
			throws ItemStreamException {
		this.delegate.open(executionContext);
	}

	@Override
	public void update(ExecutionContext executionContext)
			throws ItemStreamException {
		this.delegate.update(executionContext);
	}

}
