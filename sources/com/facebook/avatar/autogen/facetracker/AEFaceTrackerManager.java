package com.facebook.avatar.autogen.facetracker;

import X.0KC;
import X.0dV;
import X.0qQ;
import X.19E;
import X.AnonymousClass12W;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C10843Rz3;
import X.C12060Sln;
import X.C13413TZt;
import X.C13554TcQ;
import X.C59676JTh;
import X.C62961KpD;
import X.C9574RdE;
import X.L36;
import X.RFO;
import X.RU2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.jni.HybridData;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class AEFaceTrackerManager implements C13554TcQ {
    public static final RU2 Companion = new Object();
    public static C12060Sln delegate;
    public static AEFaceTrackerManager faceTrackerManager;
    public final Context context;
    public final FaceTrackerModelsProvider faceTrackerModelsProvider;
    public boolean isFrameProcessorReady;
    public HybridData mHybridData;
    public Map paths;

    private final native boolean checkImageValid(byte[] bArr, byte[] bArr2, int i, int i2);

    private final native HybridData initHybrid(Map map);

    private final native AEFaceTrackerResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, int i8);

    public final boolean checkImage(String str) {
        0qQ.A0B(str, 0);
        if (this.isFrameProcessorReady) {
            InputStream openInputStream = this.context.getContentResolver().openInputStream(Uri.parse(str));
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
            0qQ.A07(ByteBuffer.allocateDirect(0));
            if (decodeStream != null) {
                decodeStream.copyPixelsToBuffer(ByteBuffer.allocateDirect(decodeStream.getByteCount()));
                int width = decodeStream.getWidth();
                int height = decodeStream.getHeight();
                int i = width * height;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i / 2);
                allocateDirect.rewind();
                allocateDirect2.rewind();
                byte[] array = allocateDirect.array();
                0qQ.A07(array);
                byte[] array2 = allocateDirect2.array();
                0qQ.A07(array2);
                return checkImageValid(array, array2, width, height);
            }
        }
        return false;
    }

    public void onPreviewFrame(C10843Rz3 rz3) {
        C12060Sln sln;
        RFO rfo;
        if (this.isFrameProcessorReady) {
            C10843Rz3 rz32 = rz3;
            byte[] bArr = C9574RdE.A00(rz32).A0A;
            int i = rz32.A01;
            Integer valueOf = Integer.valueOf(i);
            if (bArr == null || valueOf == null) {
                C12060Sln sln2 = delegate;
                if (sln2 != null) {
                    L36 l36 = sln2.A05.A06;
                    C62961KpD.A00(l36.A00, l36.A01, "unsupported_preview_format", 36);
                }
                this.isFrameProcessorReady = false;
                return;
            }
            int i2 = rz32.A03;
            int i3 = rz32.A00;
            AEFaceTrackerResult processImageBuffer = processImageBuffer(bArr, i2, i3, 1.0f, 0, 0, i2, i3, ImageFormat.getBitsPerPixel(i) / 8, (360 - rz32.A02) % 360);
            if (processImageBuffer != null && (sln = delegate) != null && !sln.A02) {
                if (processImageBuffer.isAutogenReady && processImageBuffer.isFace && processImageBuffer.data.length != 0) {
                    rfo = RFO.AUTOGEN_ALIGNED;
                } else if (!processImageBuffer.isFace) {
                    rfo = RFO.FACE_NOT_VISIBLE;
                } else if (Math.abs(processImageBuffer.pitch) > Math.abs(processImageBuffer.yaw)) {
                    rfo = RFO.FACE_UP;
                } else if (processImageBuffer.isEyesClosed) {
                    rfo = RFO.EYES_CLOSED;
                } else {
                    rfo = RFO.FACE_NOT_CENTERED;
                }
                if (sln.A00 != rfo) {
                    sln.A06.Epw(rfo);
                }
                sln.A00 = rfo;
            }
        }
    }

    public static final /* synthetic */ void access$createFaceTracker(AEFaceTrackerManager aEFaceTrackerManager) {
        try {
            0dV.A0D("dynamic_pytorch_impl", 16);
            0dV.A0D("torch-code-gen", 16);
            0dV.A0C("autogen_frameprocessor");
            Map map = aEFaceTrackerManager.paths;
            if (map != null) {
                aEFaceTrackerManager.mHybridData = aEFaceTrackerManager.initHybrid(map);
                aEFaceTrackerManager.isFrameProcessorReady = true;
            }
        } catch (UnsatisfiedLinkError e) {
            0KC.A0F("AEFaceTrackerManager", "Failed to load autogen_frameprocessor", e);
            C12060Sln sln = delegate;
            if (sln != null) {
                L36 l36 = sln.A05.A06;
                C62961KpD.A00(l36.A00, l36.A01, "library_load_failed", 36);
            }
            faceTrackerManager = null;
        }
    }

    public AEFaceTrackerManager(Context context2, FaceTrackerModelsProvider faceTrackerModelsProvider2, C13413TZt tZt) {
        this.context = context2;
        this.faceTrackerModelsProvider = faceTrackerModelsProvider2;
        AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 23), 19E.A02(AnonymousClass12W.A01));
    }
}
