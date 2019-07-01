package com.kailin.custom;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

@Mojo(name="MyOtherPlugin",defaultPhase = LifecyclePhase.PACKAGE)
public class OtherPlugin extends AbstractMojo {

    @Parameter
    private String msg;

    @Parameter
    private List<String> stringList;

    @Parameter(property = "args")
    private String para;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("接收到的参数msg的值:"+msg);
        System.out.println("接收到的参数stringList的值"+stringList);
        System.out.println("接收到的参数args的值:"+para);
    }
}
