package net.simpleframework.module.pdf;

import net.simpleframework.ctx.AbstractModuleRef;
import net.simpleframework.ctx.ModuleContextFactory;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class PDFRef extends AbstractModuleRef {

	@Override
	public IPDFContext getModuleContext() {
		return ModuleContextFactory.get(IPDFContext.class);
	}
}
