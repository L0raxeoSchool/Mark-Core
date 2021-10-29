package com.mark.core.plugins;

import com.mark.core.utils.VersionInfo;

import java.io.File;

/**
 * The plugin object holds the information
 * to all the attributes and children of
 * the associated plugin.
 *
 * @author Lorcan Andrew Cheng
 */
@VersionInfo(
        version = "2.0",
        releaseDate = "10/29/2021",
        since = "1.0",
        contributors = {
                "Lorcan Andrew Cheng"
        }
)
public class Plugin
{

    /**
     * Default files, including directories.
     */
    private final File rootDir, jarFile, messenger, receiver;
    /**
     * Process of program, that is not final
     * so that it can be changed.
     */
    public Process process;

    /**
     * Last message to have been read
     * from this program.
     */
    public String lastReceivedMessage;

    // INFO //
    public final String NAME;
    public final String ID;
    public final String VERSION;

    /**
     * @param rootDir root directory of plugin
     * @param jarFile jar file (main program) of plugin
     * @param messenger used for the plugin to send
     *                  messages, and for receiving
     *                  programs to read.
     * @param receiver used as the inbox for
     *                 the plugin, that stores
     *                 any receiving messages.
     * @param process of the program, that can be
     *                modified.
     */
    public Plugin(File rootDir, File jarFile, File messenger, File receiver, Process process, String name, String ID, String version)
    {
        this.rootDir = rootDir;
        this.jarFile = jarFile;
        this.messenger = messenger;
        this.receiver = receiver;
        this.process = process;

        // INFO //
        this.NAME = name;
        this.ID = ID;
        this.VERSION = version;
    }

    // Getters

    public File getRootDir()
    {
        return rootDir;
    }

    public File getJarFile()
    {
        return jarFile;
    }

    public File getMessenger()
    {
        return messenger;
    }

    public File getReceiver()
    {
        return receiver;
    }

    public Process process()
    {
        return process;
    }

}
