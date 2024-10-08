package com.instagram.rtc.rsys.proxies;

import com.instagram.rtc.rsys.models.EngineModel;

public abstract class EngineProxy {
    public abstract void stateChangedHandler(EngineModel engineModel);
}
