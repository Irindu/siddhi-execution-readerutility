package org.wso2.extension.siddhi.execution.readerutility;

import org.wso2.siddhi.annotation.Example;
import org.wso2.siddhi.annotation.Extension;
import org.wso2.siddhi.annotation.ReturnAttribute;
import org.wso2.siddhi.core.config.SiddhiAppContext;
import org.wso2.siddhi.core.executor.ExpressionExecutor;
import org.wso2.siddhi.core.executor.function.FunctionExecutor;
import org.wso2.siddhi.core.util.config.ConfigReader;
import org.wso2.siddhi.query.api.definition.Attribute;

import java.util.Map;

//import org.wso2.siddhi.annotation.Parameter;
//import org.wso2.siddhi.annotation.util.DataType;

/**
 * Siddhi Function for TheFun.
 */


@Extension(
        name = "TheFun",
        namespace = "samplefunction",
        description = "This function returns Hello Irindu or the Hello the input",
        returnAttributes = @ReturnAttribute(
                description = "Returned type will be string.",
                type = {org.wso2.siddhi.annotation.util.DataType.STRING}),
        examples = {
                @Example(
                        syntax = "define stream inputStream (symbol string, price long, volume long);\n" +
                                "from inputStream select symbol , SampleFunction:TheFun() as FunctionOutput \n" +
                                "insert into outputStream;",
                        description = "This query returns symbol from inputStream and"
                                + "TheFun function output as "
                                + " FunctionOutput to the outputStream"
                )
        }
)


public class ReadSystemVariable extends FunctionExecutor {

    @Override
    protected void init(ExpressionExecutor[] expressionExecutors, ConfigReader configReader, SiddhiAppContext siddhiAppContext) {

    }

    @Override
    protected Object execute(Object[] objects) {
        return null;
    }

    @Override
    protected Object execute(Object o) {
        return null;
    }

    @Override
    public Attribute.Type getReturnType() {
        return null;
    }

    @Override
    public Map<String, Object> currentState() {
        return null;
    }

    @Override
    public void restoreState(Map<String, Object> map) {

    }
}
