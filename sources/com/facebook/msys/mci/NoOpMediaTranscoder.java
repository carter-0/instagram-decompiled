package com.facebook.msys.mci;

import X.QQE;
import X.QQF;
import java.util.Map;

public class NoOpMediaTranscoder implements MediaTranscoder {
    public byte[] transcodeImage(String str, double d, double d2, String str2, Map map) {
        return null;
    }

    public void transcodeImageV2(String str, double d, double d2, double d3, double d4, String str2, Map map, TranscodeImageCompletionCallback transcodeImageCompletionCallback) {
        transcodeImageCompletionCallback.success((String) null, (String) null, (Map) null, (Map) null);
    }

    public void estimateVideoSize(String str, long j, Double d, Double d2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        Execution.executeAsync(new QQF(this, videoSizeEstimatorCompletionCallback), (AccountSession) null, 4);
    }

    public void transcodeVideo(String str, VideoEdits videoEdits, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        Execution.executeAsync(new QQE(this, transcodeVideoCompletionCallback), (AccountSession) null, 4);
    }
}
