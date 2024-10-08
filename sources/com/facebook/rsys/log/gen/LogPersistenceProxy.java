package com.facebook.rsys.log.gen;

public abstract class LogPersistenceProxy {
    public abstract void deleteCallSummaryLog(String str);

    public abstract void writeCallSummaryLog(CallSummaryInfo callSummaryInfo, String str);
}
