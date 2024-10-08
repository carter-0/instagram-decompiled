package com.facebook.cameracore.mediapipeline.engine;

import java.util.concurrent.Executor;

public abstract class ScriptThreadExecutor implements Executor {
    public abstract void execute(Runnable runnable);

    public abstract void quit();
}
