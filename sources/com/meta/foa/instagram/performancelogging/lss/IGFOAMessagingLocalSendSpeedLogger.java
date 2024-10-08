package com.meta.foa.instagram.performancelogging.lss;

import X.C328727Fx;
import com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger;

public interface IGFOAMessagingLocalSendSpeedLogger extends FOAMessagingLocalSendSpeedLogger {
    public static final C328727Fx Companion = C328727Fx.A02;

    void annotateEphemeralLifetimeMs(Long l);

    void annotateEphemeralType(String str);

    void annotateFirstSendType(String str);

    void annotateIsDm(boolean z);

    void annotateIsInstamadillo(boolean z);

    void annotateIsLink(boolean z);

    void annotateIsMsys(boolean z);

    void annotateIsReply(boolean z);

    void annotateIsVm(boolean z);

    void annotateMediaDurationMs(int i);

    void annotateMediaPreviewEnabled(boolean z);

    void annotateMessageLifeCycleState(String str);

    void annotateMessageSubtype(String str);

    void annotateMsysThreadId(long j);

    void annotateNumPendingThreadRowUpdateTasks(int i);

    void annotateNumSendMutationsCreated(int i);

    void annotateNumViewModelsToGenerate(int i);

    void annotateOccamadilloThreadId(Long l);

    void annotateOpenThreadId(String str);

    void annotateReactToType(String str);

    void annotateReplyToType(String str);

    void annotateSendGroupSize(int i);

    void annotateThreadType(int i, String str);

    void onLogCreateLocalThreadEnd();

    void onLogCreateLocalThreadStart();

    void onLogCreateSendMutationEnd();

    void onLogCreateSendMutationStart();

    void onLogCreateViewModelAndUpdateRecyclerViewEnd();

    void onLogCreateViewModelAndUpdateRecyclerViewStart();

    void onLogDispatchSendMutationEnd();

    void onLogDispatchSendMutationStart();

    void onLogFetchMessageHistoryFromServerEnd();

    void onLogFetchMessageHistoryFromServerStart();

    void onLogFinishThreadRowUpdateTask();

    void onLogGenerateMessageListViewModelsEnd();

    void onLogGenerateMessageListViewModelsStart();

    void onLogGenerateMessageRowDataEnd();

    void onLogGenerateMessageRowDataStart();

    void onLogMessageAddedToMemory(boolean z);

    void onLogPostThreadUpdateEventEnd();

    void onLogPostThreadUpdateEventStart();

    void onLogReceiverFetchEnd();

    void onLogReceiverFetchStart();

    void onLogScheduleThreadRowUpdateTaskEnd();

    void onLogScheduleThreadRowUpdateTaskStart();

    void onLogSendServiceEnd();

    void onLogSendServiceStart();

    void onLogShowOptimisticMessageEnd();

    void onLogShowOptimisticMessageStart();

    void onLogTransportMessageEnd();

    void onLogTransportMessageStart();

    void onLogUpdateLocalThreadIdEnd();

    void onLogUpdateLocalThreadIdStart();

    void onLogUpdateThreadRowDataListEnd();

    void onLogUpdateThreadRowDataListStart();
}
