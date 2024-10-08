package X;

/* renamed from: X.HeF  reason: case insensitive filesystem */
public abstract class C55224HeF {
    public static final boolean A00(HMQ hmq) {
        0qQ.A0B(hmq, 0);
        if (hmq == HMQ.DETECTOR_READY || hmq == HMQ.POSE_DETECTING || hmq == HMQ.POSE_DETECTED || hmq == HMQ.POSE_CENTER_FACE || hmq == HMQ.POSE_TOO_CLOSE || hmq == HMQ.POSE_TOO_FAR || hmq == HMQ.POSE_FIND_FACE || hmq == HMQ.POSE_TOO_MANY_FACES || hmq == HMQ.FRAME_TOO_DARK) {
            return true;
        }
        return false;
    }
}
