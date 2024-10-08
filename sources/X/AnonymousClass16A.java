package X;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.16A  reason: invalid class name */
public final class AnonymousClass16A {
    public static final int[] A02 = {CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS};
    public static final int[] A03 = {CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, 200, 200};
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(4);
    public final AtomicReferenceArray A01 = new AtomicReferenceArray(4);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.16A.A00(int):byte[], dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final byte[] A00(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.16A.A00(int):byte[], dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16A.A00(int):byte[]");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.16A.A01(int, int):char[], dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final char[] A01(int r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.16A.A01(int, int):char[], dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16A.A01(int, int):char[]");
    }
}
