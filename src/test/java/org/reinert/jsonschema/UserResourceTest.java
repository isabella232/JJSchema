package org.reinert.jsonschema;

import org.reinert.jsonschema.resource.UserResource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.TestCase;

public class UserResourceTest extends TestCase {
	
	ObjectMapper om = new ObjectMapper();
	
	public void testHyperSchema() throws JsonProcessingException {
		HyperSchema userHyperSchema = HyperSchema.generateHyperSchema(UserResource.class);
		System.out.println(om.writeValueAsString(userHyperSchema));
	}

}