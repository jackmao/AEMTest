package com.pwc.tomashu.aemtest;

/**
 * A simple service interfacessss
 */
public interface HelloService {
    
    /**
     * @return the name of the underlying JCR repository implementation
     */
    public String getRepositoryName();

}