package com.zhangfuwen.opencrud.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Test Data", description = "Test data to test")
public class TestData
{
    @ApiModelProperty(value = "id")
	public int id=0;
	public String name="test data";
	public String status="OK";

	public TestData(int id, String name, String status)
	{
		this.id = id;
		this.name = name;
		this.status = status;
	}
}
