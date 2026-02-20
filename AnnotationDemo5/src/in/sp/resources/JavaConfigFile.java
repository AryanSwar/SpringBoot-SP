package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.sp.beans")
//if multiple component are there the use array type passing
//@ComponentScan({"in.sp.beans1","in.sp.beans2"})
//@ComponentScan(basePackages = {"in.sp.beans1","in.sp.beans2"})
public class JavaConfigFile {

}
