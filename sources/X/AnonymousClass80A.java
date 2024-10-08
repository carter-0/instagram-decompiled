package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.nio.ByteBuffer;

/* renamed from: X.80A  reason: invalid class name */
public final class AnonymousClass80A {
    public VersionedCapability A00;
    public final int A01;
    public final ARAssetType A02;
    public final ARRequestAsset.CompressionMethod A03;
    public final EffectAssetType A04;
    public final AnonymousClass8LN A05;
    public final Boolean A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final C371118xc A0E;

    public static void A01(String str, ByteBuffer byteBuffer) {
        if (str == null) {
            byteBuffer.putInt(-1);
            return;
        }
        byteBuffer.putInt(str.getBytes().length);
        byteBuffer.put(str.getBytes());
    }

    public final String A02() {
        ARAssetType aRAssetType = this.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            EffectAssetType effectAssetType = this.A04;
            if (effectAssetType == null) {
                return null;
            }
            return effectAssetType.name();
        } else if (ordinal == 1) {
            VersionedCapability versionedCapability = this.A00;
            versionedCapability.getClass();
            return versionedCapability.toServerValue();
        } else if (ordinal == 2 || ordinal == 3) {
            C371118xc r0 = this.A0E;
            r0.getClass();
            return r0.toString();
        } else {
            throw new IllegalStateException(002.A0R("Unsupported asset type: ", aRAssetType.toString()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01dc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01dd, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x0127 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017e A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0185 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x018c A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0198 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01a0 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b4 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01bb A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01c3 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01dc A[ExcHandler: IllegalArgumentException | IllegalStateException | BufferUnderflowException (e java.lang.Throwable), PHI: r4 
      PHI: (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v7 java.lang.String), (r4v6 java.lang.String), (r4v6 java.lang.String) binds: [B:9:0x0031, B:92:0x014c, B:25:0x0069, B:82:0x0127] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x015e A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016a A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass80A(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            r8.<init>()
            int r3 = r9.remaining()
            r2 = 0
            long r4 = r9.getLong()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d6 }
            r6 = 7310021016723351138(0x65726962726f6662, double:4.774966457081997E180)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01ca
            java.lang.String r1 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d6 }
            r1.getClass()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d6 }
            r8.A09 = r1     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            java.lang.String r6 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            r8.A0A = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c6 }
            java.lang.String r6 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c6 }
            r8.A0B = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c6 }
            java.lang.String r4 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c6 }
            r4.getClass()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c6 }
            com.facebook.cameracore.ardelivery.model.ARAssetType r7 = com.facebook.cameracore.ardelivery.model.ARAssetType.valueOf(r4)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A02 = r7     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            java.lang.String r4 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            int r6 = r7.ordinal()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r5 = 0
            if (r6 == r5) goto L_0x012e
            r0 = 1
            if (r6 == r0) goto L_0x0067
            r0 = 2
            if (r6 == r0) goto L_0x005b
            r0 = 3
            if (r6 == r0) goto L_0x005b
            java.lang.String r2 = "Illegal asset type: "
            java.lang.String r0 = r7.toString()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            java.lang.String r2 = X.002.A0R(r2, r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x005b:
            if (r4 != 0) goto L_0x0062
            r7 = r2
        L_0x005e:
            r6 = r2
            r0 = r2
            goto L_0x0139
        L_0x0062:
            X.8xc r7 = X.C371118xc.valueOf(r4)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x005e
        L_0x0067:
            java.lang.String r6 = "AML_FACE_TRACKER"
            boolean r0 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x007b
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x0071:
            int r7 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            switch(r7) {
                case 0: goto L_0x0112;
                case 1: goto L_0x0078;
                case 2: goto L_0x010f;
                case 3: goto L_0x010c;
                case 4: goto L_0x0109;
                case 5: goto L_0x0106;
                case 6: goto L_0x0103;
                case 7: goto L_0x0100;
                case 8: goto L_0x00fd;
                case 9: goto L_0x00fa;
                default: goto L_0x0078;
            }     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x0078:
            java.lang.String r0 = "VersionedCapability is not set up for the given SupportAssetType:"
            goto L_0x00de
        L_0x007b:
            java.lang.String r0 = "TARGET_RECOGNITION"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x0086:
            java.lang.String r0 = "SEGMENTATION"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x0091
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x0091:
            java.lang.String r0 = "HAIR_SEGMENTATION"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x009c:
            java.lang.String r0 = "HAND_TRACKING"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x00a7
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x00a7:
            java.lang.String r0 = "XRAY"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x00b2
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x00b2:
            java.lang.String r0 = "M_SUGGESTIONS_CORE"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r0 = X.AnonymousClass05K.A0u     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x00bd:
            java.lang.String r0 = "FITTED_EXPRESSION_TRACKER"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x00c8
            java.lang.Integer r0 = X.AnonymousClass05K.A15     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x00c8:
            java.lang.String r0 = "GAZE_CORRECTION"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = X.AnonymousClass05K.A1F     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x00d3:
            java.lang.String r0 = "BI_BYTEDOC"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x0115
            java.lang.Integer r0 = X.AnonymousClass05K.A1I     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0071
        L_0x00de:
            switch(r7) {
                case 0: goto L_0x011d;
                case 1: goto L_0x00f7;
                case 2: goto L_0x00f4;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00ee;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00e8;
                case 7: goto L_0x00e5;
                case 8: goto L_0x00e2;
                default: goto L_0x00e1;
            }     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x00e1:
            goto L_0x011b
        L_0x00e2:
            java.lang.String r6 = "GAZE_CORRECTION"
            goto L_0x011d
        L_0x00e5:
            java.lang.String r6 = "FITTED_EXPRESSION_TRACKER"
            goto L_0x011d
        L_0x00e8:
            java.lang.String r6 = "M_SUGGESTIONS_CORE"
            goto L_0x011d
        L_0x00eb:
            java.lang.String r6 = "XRAY"
            goto L_0x011d
        L_0x00ee:
            java.lang.String r6 = "HAND_TRACKING"
            goto L_0x011d
        L_0x00f1:
            java.lang.String r6 = "HAIR_SEGMENTATION"
            goto L_0x011d
        L_0x00f4:
            java.lang.String r6 = "SEGMENTATION"
            goto L_0x011d
        L_0x00f7:
            java.lang.String r6 = "TARGET_RECOGNITION"
            goto L_0x011d
        L_0x00fa:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.BiBytedoc     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x00fd:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.GazeCorrection     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x0100:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFitting     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x0103:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.MSuggestionsCore     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x0106:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.XRay     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x0109:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HandTracker     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x010c:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HairSegmentation     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x010f:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Segmentation     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x0112:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x012b
        L_0x0115:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r6.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0126
        L_0x011b:
            java.lang.String r6 = "BI_BYTEDOC"
        L_0x011d:
            java.lang.String r0 = X.002.A0R(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r6.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x0126:
            throw r6     // Catch:{ IllegalArgumentException -> 0x0127, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x0127:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.fromServerValue(r4)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x012b:
            r7 = r2
            r0 = r2
            goto L_0x0139
        L_0x012e:
            if (r4 != 0) goto L_0x0133
            com.facebook.cameracore.ardelivery.model.EffectAssetType r0 = com.facebook.cameracore.ardelivery.model.EffectAssetType.NORMAL_EFFECT     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0137
        L_0x0133:
            com.facebook.cameracore.ardelivery.model.EffectAssetType r0 = com.facebook.cameracore.ardelivery.model.EffectAssetType.valueOf(r4)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x0137:
            r6 = r2
            r7 = r2
        L_0x0139:
            r8.A04 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A00 = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A0E = r7     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            java.lang.String r6 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A0C = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c6 }
            java.lang.String r4 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c6 }
            r4.getClass()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c6 }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = com.facebook.cameracore.ardelivery.model.ARRequestAsset.CompressionMethod.valueOf(r4)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A03 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            int r0 = r9.getInt()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A01 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x018c
            java.lang.String r4 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A08 = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x0164:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A07 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x0178:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x0198
            java.lang.String r4 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r4 != 0) goto L_0x0191
            goto L_0x018f
        L_0x0185:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A07 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0178
        L_0x018c:
            r8.A08 = r2     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x0164
        L_0x018f:
            r0 = r2
            goto L_0x0195
        L_0x0191:
            X.8LN r0 = X.AnonymousClass8LN.valueOf(r4)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x0195:
            r8.A05 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x019a
        L_0x0198:
            r8.A05 = r2     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x019a:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x01bb
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A06 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
        L_0x01ae:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A0D = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x01c2
        L_0x01bb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            r8.A06 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            goto L_0x01ae
        L_0x01c2:
            return
        L_0x01c3:
            r8.A0D = r2     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01dc }
            return
        L_0x01c6:
            r0 = move-exception
            r2 = r1
            r4 = r6
            goto L_0x01de
        L_0x01ca:
            java.lang.String r0 = "Invalid data: "
            java.lang.String r1 = X.002.A0Q(r0, r4)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d6 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d6 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d6 }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d6 }
        L_0x01d6:
            r0 = move-exception
            goto L_0x01da
        L_0x01d8:
            r0 = move-exception
            r2 = r1
        L_0x01da:
            r4 = r2
            goto L_0x01de
        L_0x01dc:
            r0 = move-exception
            r2 = r1
        L_0x01de:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = " -- ByteBuffer size:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", effect id:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", error string:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80A.<init>(java.nio.ByteBuffer):void");
    }

    public static String A00(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        if (i < 0) {
            throw new IllegalStateException("read the wrong cache");
        } else if (i == 0) {
            throw new IllegalStateException("the number of bytes shouldn't be 0");
        } else if (i <= 4096) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return new String(bArr);
        } else {
            throw new IllegalStateException(002.A0c("trying to allocate ", " bytes which exceeds the buffer limit.", i));
        }
    }

    public AnonymousClass80A(ARAssetType aRAssetType, ARRequestAsset.CompressionMethod compressionMethod, EffectAssetType effectAssetType, C371118xc r6, AnonymousClass8LN r7, VersionedCapability versionedCapability, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, int i) {
        switch (aRAssetType.ordinal()) {
            case 0:
                str2.getClass();
                break;
            case 1:
                0JA.A06(str2 == null);
                versionedCapability.getClass();
                break;
            case 2:
            case 3:
                r6.getClass();
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Got unsupported type: ");
                sb.append(aRAssetType);
                throw new IllegalArgumentException(sb.toString());
        }
        str4.getClass();
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A02 = aRAssetType;
        this.A00 = versionedCapability;
        if (aRAssetType != ARAssetType.EFFECT) {
            effectAssetType = null;
        } else if (effectAssetType == null) {
            effectAssetType = EffectAssetType.NORMAL_EFFECT;
        }
        this.A04 = effectAssetType;
        this.A0C = null;
        this.A03 = compressionMethod;
        this.A01 = i;
        this.A08 = str4;
        this.A07 = bool;
        this.A05 = r7;
        this.A0E = r6;
        this.A06 = bool2;
        this.A0D = str5;
    }
}
