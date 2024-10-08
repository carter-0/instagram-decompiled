package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Rl  reason: invalid class name and case insensitive filesystem */
public final class C378849Rl extends C342717p3 implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C343047pa A02;
    public C343047pa A03;
    public C343047pa A04;
    public C343047pa A05;
    public Boolean A06;
    public Boolean A07 = false;
    public Boolean A08 = false;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B = false;
    public Double A0C;
    public Double A0D;
    public Double A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H = 0;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q = 0;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Long A0V;
    public String A0W;
    public List A0X;
    public List A0Y;
    public final C14252Tsa A0Z;
    public final Float A0a;
    public final Float A0b;
    public final String A0c;
    public final int[] A0d = new int[2];

    public static void A01(C343047pa r2, StringBuilder sb) {
        if (r2 != null) {
            sb.append(r2.A02);
            sb.append('x');
            sb.append(r2.A01);
            return;
        }
        sb.append("null");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0117, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0083, code lost:
        if (((java.lang.Number) r0).intValue() == 17) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r7.A0I.intValue() != 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x009d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a2, code lost:
        return java.lang.Boolean.valueOf(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C342727p4 r8) {
        /*
            r7 = this;
            int r1 = r8.A00
            r0 = 45
            if (r1 == r0) goto L_0x012d
            r0 = 52
            if (r1 == r0) goto L_0x012b
            r0 = 65
            r4 = 0
            if (r1 == r0) goto L_0x0126
            r3 = 1
            switch(r1) {
                case 2: goto L_0x0070;
                case 3: goto L_0x0086;
                case 4: goto L_0x0115;
                case 5: goto L_0x0115;
                case 6: goto L_0x0115;
                case 7: goto L_0x0089;
                case 8: goto L_0x00a3;
                case 9: goto L_0x00a6;
                case 10: goto L_0x00a9;
                case 11: goto L_0x00ac;
                case 12: goto L_0x00af;
                case 13: goto L_0x00b2;
                case 14: goto L_0x00b5;
                case 15: goto L_0x00b8;
                case 16: goto L_0x0118;
                case 17: goto L_0x00bb;
                case 18: goto L_0x00be;
                case 19: goto L_0x00c1;
                case 20: goto L_0x00c4;
                case 21: goto L_0x0106;
                case 22: goto L_0x0109;
                case 23: goto L_0x010c;
                case 24: goto L_0x010f;
                case 25: goto L_0x0112;
                default: goto L_0x0013;
            }
        L_0x0013:
            switch(r1) {
                case 27: goto L_0x002b;
                case 28: goto L_0x002e;
                case 29: goto L_0x0031;
                case 30: goto L_0x0034;
                case 31: goto L_0x0037;
                case 32: goto L_0x003a;
                case 33: goto L_0x003d;
                case 34: goto L_0x0040;
                case 35: goto L_0x0043;
                case 36: goto L_0x0046;
                case 37: goto L_0x0049;
                case 38: goto L_0x004c;
                case 39: goto L_0x004f;
                case 40: goto L_0x005a;
                case 41: goto L_0x0062;
                case 42: goto L_0x006a;
                case 43: goto L_0x006d;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r1) {
                case 57: goto L_0x0025;
                case 58: goto L_0x012b;
                case 59: goto L_0x0028;
                case 60: goto L_0x0115;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.String r0 = "Invalid Settings key: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0025:
            java.lang.Boolean r0 = r7.A09
            return r0
        L_0x0028:
            java.lang.Integer r0 = r7.A0S
            return r0
        L_0x002b:
            java.lang.Long r0 = r7.A0V
            return r0
        L_0x002e:
            java.lang.Float r0 = r7.A0b
            return r0
        L_0x0031:
            java.lang.Float r0 = r7.A0a
            return r0
        L_0x0034:
            java.lang.Double r0 = r7.A0C
            return r0
        L_0x0037:
            java.lang.Double r0 = r7.A0E
            return r0
        L_0x003a:
            java.lang.Double r0 = r7.A0D
            return r0
        L_0x003d:
            X.7pa r0 = r7.A04
            return r0
        L_0x0040:
            X.7pa r0 = r7.A03
            return r0
        L_0x0043:
            X.7pa r0 = r7.A05
            return r0
        L_0x0046:
            X.7pa r0 = r7.A02
            return r0
        L_0x0049:
            java.util.List r0 = r7.A0X
            return r0
        L_0x004c:
            java.util.List r0 = r7.A0Y
            return r0
        L_0x004f:
            int[] r0 = r7.A0d
            r1 = r0[r4]
            r0 = r0[r3]
            int[] r0 = new int[]{r1, r0}
            return r0
        L_0x005a:
            android.graphics.Rect r1 = r7.A01
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            return r0
        L_0x0062:
            android.graphics.Rect r1 = r7.A00
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            return r0
        L_0x006a:
            java.lang.String r0 = r7.A0W
            return r0
        L_0x006d:
            java.lang.String r0 = r7.A0c
            return r0
        L_0x0070:
            android.graphics.Rect r0 = X.C14254Tsc.A00
            X.7p4 r0 = X.C342717p3.A0s
            java.lang.Object r0 = r7.A02(r0)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 17
            if (r1 != r0) goto L_0x009e
            goto L_0x009d
        L_0x0086:
            java.lang.Boolean r0 = r7.A0A
            return r0
        L_0x0089:
            java.lang.Integer r0 = r7.A0I
            r0.getClass()
            int r1 = r0.intValue()
            r0 = -1
            if (r1 == r0) goto L_0x009d
            java.lang.Integer r0 = r7.A0I
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x009e
        L_0x009d:
            r4 = 1
        L_0x009e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x00a3:
            java.lang.Boolean r0 = r7.A0B
            return r0
        L_0x00a6:
            java.lang.Integer r0 = r7.A0J
            return r0
        L_0x00a9:
            java.lang.Integer r0 = r7.A0I
            return r0
        L_0x00ac:
            java.lang.Integer r0 = r7.A0F
            return r0
        L_0x00af:
            java.lang.Integer r0 = r7.A0G
            return r0
        L_0x00b2:
            java.lang.Integer r0 = r7.A0H
            return r0
        L_0x00b5:
            java.lang.Integer r0 = r7.A0L
            return r0
        L_0x00b8:
            java.lang.Integer r0 = r7.A0M
            return r0
        L_0x00bb:
            java.lang.Integer r0 = r7.A0O
            return r0
        L_0x00be:
            java.lang.Integer r0 = r7.A0P
            return r0
        L_0x00c1:
            java.lang.Integer r0 = r7.A0Q
            return r0
        L_0x00c4:
            X.Tsa r1 = r7.A0Z
            X.7p1 r0 = X.C342687p0.A13
            java.lang.Object r2 = r1.A01(r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Integer r0 = r7.A0Q
            r0.getClass()
            int r6 = r0.intValue()
            int[] r1 = r7.A0d
            android.graphics.Rect r0 = X.C14254Tsc.A00
            r5 = 0
            r4 = r1[r4]
            r3 = r1[r3]
            java.util.Iterator r2 = r2.iterator()
        L_0x00e4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r1 * 1000
            if (r0 < r4) goto L_0x00e4
            if (r0 > r3) goto L_0x00e4
            if (r0 <= r5) goto L_0x00e4
            r5 = r1
            goto L_0x00e4
        L_0x00fe:
            if (r5 == 0) goto L_0x0101
            r6 = r5
        L_0x0101:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            return r0
        L_0x0106:
            java.lang.Integer r0 = r7.A0N
            return r0
        L_0x0109:
            java.lang.Integer r0 = r7.A0K
            return r0
        L_0x010c:
            java.lang.Integer r0 = r7.A0R
            return r0
        L_0x010f:
            java.lang.Integer r0 = r7.A0T
            return r0
        L_0x0112:
            java.lang.Integer r0 = r7.A0U
            return r0
        L_0x0115:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0118:
            X.7pa r0 = r7.A03
            if (r0 == 0) goto L_0x0126
            int r1 = r0.A02
            int r0 = r0.A01
            int r1 = r1 * r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0126:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            return r0
        L_0x012b:
            r0 = 0
            return r0
        L_0x012d:
            java.lang.Boolean r0 = r7.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378849Rl.A02(X.7p4):java.lang.Object");
    }

    public final String A03() {
        String str;
        StringBuilder sb = new StringBuilder(IgNetworkConsentStorage.MAX_ENTRIES);
        sb.append("mFocusMode");
        sb.append('=');
        sb.append(this.A0J);
        sb.append(",mAntibanding");
        sb.append('=');
        sb.append(this.A0F);
        sb.append(",mColorEffect");
        sb.append('=');
        sb.append(this.A0G);
        sb.append(",mIsAutoExposureLock");
        sb.append('=');
        sb.append(this.A07);
        sb.append(",mIsAutoWhiteBalanceLock");
        sb.append('=');
        sb.append(this.A08);
        sb.append(",mFlashMode");
        sb.append('=');
        sb.append(this.A0I);
        sb.append(",mExposureCompensation");
        sb.append('=');
        sb.append(this.A0H);
        sb.append(",mFocusAreas");
        sb.append('=');
        sb.append(C342717p3.A00(this.A0X));
        sb.append(",mHorizontalViewAngle");
        sb.append('=');
        sb.append(this.A0a);
        sb.append(",mVerticalViewAngle");
        sb.append('=');
        sb.append(this.A0b);
        sb.append(",mJpegQuality");
        sb.append('=');
        sb.append(this.A0L);
        sb.append(",mJpegThumbnailQuality");
        sb.append('=');
        sb.append(this.A0M);
        sb.append(",mJpegThumbnailSize");
        sb.append('=');
        String str2 = "null";
        A01(this.A02, sb);
        sb.append(",mMeteringAreas");
        sb.append('=');
        sb.append(C342717p3.A00(this.A0Y));
        sb.append(",mPictureFormat");
        sb.append('=');
        sb.append(this.A0O);
        sb.append(",mPictureSize");
        sb.append('=');
        A01(this.A03, sb);
        sb.append(",mYuvPictureSize");
        sb.append('=');
        sb.append(str2);
        sb.append(",mPreviewFormat");
        sb.append('=');
        sb.append(this.A0P);
        sb.append(",mPreviewFpsRange");
        sb.append('=');
        int[] iArr = this.A0d;
        sb.append(iArr[0]);
        sb.append('-');
        sb.append(iArr[1]);
        sb.append(",mPreviewSize");
        sb.append('=');
        A01(this.A04, sb);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSceneMode");
        sb.append('=');
        sb.append(this.A0R);
        sb.append(",mIsVideoStabilizationEnabled");
        sb.append('=');
        sb.append(this.A0A);
        sb.append(",mIsPreviewStabilizationEnabled");
        sb.append('=');
        sb.append(false);
        sb.append(",mVideoSize");
        sb.append('=');
        A01(this.A05, sb);
        sb.append(",mWhiteBalance");
        sb.append('=');
        sb.append(this.A0T);
        sb.append(",mZoom");
        sb.append('=');
        sb.append(this.A0U);
        sb.append(",mPreviewRect");
        sb.append("=(");
        Rect rect = this.A01;
        if (rect != null) {
            str = rect.flattenToString();
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(')');
        sb.append(",mPictureRect");
        sb.append("=(");
        Rect rect2 = this.A00;
        if (rect2 != null) {
            str2 = rect2.flattenToString();
        }
        sb.append(str2);
        sb.append(')');
        sb.append(",mRecordingHint");
        sb.append('=');
        sb.append(this.A0B);
        sb.append(",mGpsAltitude");
        sb.append('=');
        sb.append(this.A0C);
        sb.append(",mGpsLongitude");
        sb.append('=');
        sb.append(this.A0E);
        sb.append(",mGpsLatitude");
        sb.append('=');
        sb.append(this.A0D);
        sb.append(",mGpsProcessingMethod");
        sb.append('=');
        sb.append(this.A0W);
        sb.append(",mGpsTimestamp");
        sb.append('=');
        sb.append(this.A0V);
        sb.append(",mPhotoRotation");
        sb.append('=');
        sb.append(this.A0N);
        sb.append(",mVideoRotation");
        sb.append('=');
        sb.append(this.A0S);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSourceConfig");
        sb.append('=');
        return AnonymousClass7TF.A0l(this.A0c, sb);
    }

    public final void A04(C342727p4 r7, Object obj) {
        int i = r7.A00;
        if (i == 0) {
            this.A07 = (Boolean) obj;
        } else if (i == 1) {
            this.A08 = (Boolean) obj;
        } else if (i == 2) {
            if (AnonymousClass7TG.A1V(C342687p0.A0K, this.A0Z)) {
                obj.getClass();
                boolean A1a = AnonymousClass7TE.A1a(obj);
                int i2 = 0;
                if (A1a) {
                    i2 = 17;
                }
                A04(C342717p3.A0s, Integer.valueOf(i2));
                if (A1a) {
                    A04(C342717p3.A0r, false);
                }
            }
        } else if (i == 3) {
            this.A0A = (Boolean) obj;
        } else if (i == 27) {
            this.A0V = (Long) obj;
        } else if (i == 42) {
            this.A0W = (String) obj;
        } else if (i == 45) {
            this.A06 = (Boolean) obj;
        } else if (i == 52) {
        } else {
            if (i == 57) {
                this.A09 = (Boolean) obj;
            } else if (i != 59) {
                switch (i) {
                    case 8:
                        this.A0B = (Boolean) obj;
                        return;
                    case 9:
                        this.A0J = (Integer) obj;
                        return;
                    case 10:
                        this.A0I = (Integer) obj;
                        return;
                    case 11:
                        this.A0F = (Integer) obj;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        this.A0G = (Integer) obj;
                        return;
                    case 13:
                        this.A0H = (Integer) obj;
                        return;
                    case 14:
                        this.A0L = (Integer) obj;
                        return;
                    case 15:
                        this.A0M = (Integer) obj;
                        return;
                    default:
                        switch (i) {
                            case 17:
                                this.A0O = (Integer) obj;
                                return;
                            case EglBase14Impl.EGLExt_SDK_VERSION:
                                this.A0P = (Integer) obj;
                                return;
                            case 19:
                                this.A0Q = (Integer) obj;
                                return;
                            default:
                                switch (i) {
                                    case 21:
                                        this.A0N = (Integer) obj;
                                        return;
                                    case 22:
                                        this.A0K = (Integer) obj;
                                        return;
                                    case 23:
                                        this.A0R = (Integer) obj;
                                        return;
                                    case 24:
                                        this.A0T = (Integer) obj;
                                        return;
                                    case 25:
                                        this.A0U = (Integer) obj;
                                        return;
                                    default:
                                        Rect rect = null;
                                        switch (i) {
                                            case 30:
                                                this.A0C = (Double) obj;
                                                return;
                                            case 31:
                                                this.A0E = (Double) obj;
                                                return;
                                            case 32:
                                                this.A0D = (Double) obj;
                                                return;
                                            case 33:
                                                C343047pa r8 = (C343047pa) obj;
                                                this.A04 = r8;
                                                if (r8 != null) {
                                                    rect = new Rect(0, 0, r8.A02, r8.A01);
                                                }
                                                this.A01 = rect;
                                                return;
                                            case 34:
                                                C343047pa r82 = (C343047pa) obj;
                                                this.A03 = r82;
                                                if (r82 != null) {
                                                    rect = new Rect(0, 0, r82.A02, r82.A01);
                                                }
                                                this.A00 = rect;
                                                return;
                                            case 35:
                                                this.A05 = (C343047pa) obj;
                                                return;
                                            case 36:
                                                this.A02 = (C343047pa) obj;
                                                return;
                                            case 37:
                                                this.A0X = C14253Tsb.A00((List) obj);
                                                return;
                                            case 38:
                                                this.A0Y = C14253Tsb.A00((List) obj);
                                                return;
                                            case 39:
                                                int[] iArr = (int[]) obj;
                                                if (iArr != null && iArr.length == 2) {
                                                    int[] iArr2 = this.A0d;
                                                    iArr2[0] = iArr[0];
                                                    iArr2[1] = iArr[1];
                                                    return;
                                                }
                                                return;
                                            default:
                                                throw C13989Tnp.A0k("Cannot directly set: ", i);
                                        }
                                }
                        }
                }
            } else {
                this.A0S = (Integer) obj;
            }
        }
    }

    public C378849Rl(Camera.Parameters parameters, C14252Tsa tsa) {
        List emptyList;
        int i;
        List emptyList2;
        Camera.Size size;
        C343047pa r0;
        Camera.Size size2;
        Double valueOf = Double.valueOf(0.0d);
        this.A0C = valueOf;
        this.A0E = valueOf;
        this.A0D = valueOf;
        this.A0V = C51971G9r.A0m();
        this.A0N = 0;
        this.A0K = 0;
        this.A09 = false;
        this.A0S = 0;
        this.A06 = AnonymousClass7TE.A0v();
        this.A0c = parameters.flatten();
        this.A0Z = tsa;
        this.A0J = Integer.valueOf(C378889Rp.A02(parameters.getFocusMode()));
        this.A0F = Integer.valueOf(C378889Rp.A00(parameters.getAntibanding()));
        this.A0G = Integer.valueOf(C378889Rp.A01(parameters.getColorEffect()));
        if (AnonymousClass7TG.A1V(C342687p0.A03, tsa)) {
            this.A07 = Boolean.valueOf(parameters.getAutoExposureLock());
        }
        if (AnonymousClass7TG.A1V(C342687p0.A06, tsa)) {
            this.A08 = Boolean.valueOf(parameters.getAutoWhiteBalanceLock());
        }
        this.A0I = Integer.valueOf(C378899Rq.A00(parameters.getFlashMode()));
        if (AnonymousClass7TG.A1V(C342687p0.A0G, tsa)) {
            this.A0H = Integer.valueOf(parameters.getExposureCompensation());
        }
        if (AnonymousClass7TG.A1V(C342687p0.A0V, tsa)) {
            Rect rect = C14254Tsc.A00;
            emptyList = C14253Tsb.A00(C14254Tsc.A02(parameters.get("focus-areas")));
        } else {
            emptyList = Collections.emptyList();
        }
        this.A0X = emptyList;
        this.A0a = Float.valueOf(parameters.getHorizontalViewAngle());
        this.A0b = Float.valueOf(parameters.getVerticalViewAngle());
        this.A0L = Integer.valueOf(parameters.getJpegQuality());
        Rect rect2 = C14254Tsc.A00;
        try {
            i = parameters.getJpegThumbnailQuality();
        } catch (NumberFormatException e) {
            Log.e(AnonymousClass000.A00(4389), 002.A0R("Invalid jpeg thumbnail quality parameter string=", parameters.get("jpeg-thumbnail-quality")), e);
            i = 85;
        }
        this.A0M = Integer.valueOf(i);
        try {
            Camera.Size jpegThumbnailSize = parameters.getJpegThumbnailSize();
            this.A02 = new C343047pa(jpegThumbnailSize.width, jpegThumbnailSize.height);
        } catch (NumberFormatException unused) {
        }
        if (AnonymousClass7TG.A1V(C342687p0.A0W, tsa)) {
            emptyList2 = C14253Tsb.A00(C14254Tsc.A02(parameters.get("metering-areas")));
        } else {
            emptyList2 = Collections.emptyList();
        }
        this.A0Y = emptyList2;
        this.A0O = Integer.valueOf(parameters.getPictureFormat());
        C343047pa r3 = null;
        try {
            size = parameters.getPictureSize();
        } catch (NumberFormatException unused2) {
            size = null;
        }
        C342727p4 r4 = C342717p3.A0k;
        if (size != null) {
            r0 = new C343047pa(size.width, size.height);
        } else {
            r0 = null;
        }
        A04(r4, r0);
        this.A0P = Integer.valueOf(parameters.getPreviewFormat());
        parameters.getPreviewFpsRange(this.A0d);
        if (AnonymousClass7TE.A1b(tsa.A01)) {
            this.A0Q = Integer.valueOf(parameters.getPreviewFrameRate());
        }
        this.A0R = Integer.valueOf(C378889Rp.A03(parameters.getSceneMode()));
        this.A0A = Boolean.valueOf(parameters.getVideoStabilization());
        this.A0T = Integer.valueOf(C378889Rp.A04(parameters.getWhiteBalance()));
        this.A0U = Integer.valueOf(parameters.getZoom());
        try {
            size2 = parameters.getPreviewSize();
        } catch (NumberFormatException unused3) {
            size2 = null;
        }
        A04(C342717p3.A0q, size2 != null ? new C343047pa(size2.width, size2.height) : r3);
    }

    public final Object clone() {
        return super.clone();
    }
}
