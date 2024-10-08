package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Q0n  reason: case insensitive filesystem */
public final class C7241Q0n {
    public static final Set A00;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r6 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8 = X.0fX.A00(r6, 1543809183);
        r15.setInteger("max-input-size", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8.getName();
        X.0fX.A07(r8, (android.media.MediaCrypto) null, r10, r16, 0, -1934378656);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r16 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1 = new X.C7243Q0p(r8, r17, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1.A03.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.0wb.A06("decoder_init_error_details", X.SL2.A01(r8, r15), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        throw new X.C8828RBe(r8.getName(), r15.toString(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        throw new X.C8828RBe(r6, r15.toString(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C7243Q0p A00(android.media.MediaFormat r15, android.view.Surface r16, com.instagram.common.session.UserSession r17, java.util.List r18) {
        /*
            r14 = this;
            r4 = 10
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r18)
            r0 = 0
        L_0x0007:
            int r2 = r0 + 1
            if (r0 >= r4) goto L_0x00c7
            r9 = 0
            java.lang.String r0 = "mime"
            r10 = r15
            java.lang.String r5 = r15.getString(r0)     // Catch:{ Exception -> 0x00b2 }
            int r7 = android.media.MediaCodecList.getCodecCount()     // Catch:{ Exception -> 0x00b2 }
            r1 = 0
        L_0x0019:
            if (r1 >= r7) goto L_0x009e
            android.media.MediaCodecInfo r6 = android.media.MediaCodecList.getCodecInfoAt(r1)     // Catch:{ Exception -> 0x00b2 }
            boolean r0 = r6.isEncoder()     // Catch:{ Exception -> 0x00b2 }
            if (r0 != 0) goto L_0x004c
            java.lang.String[] r0 = r6.getSupportedTypes()     // Catch:{ Exception -> 0x00b2 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x00b2 }
            boolean r0 = r0.contains(r5)     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x004c
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x00b2 }
            java.util.Set r0 = A00     // Catch:{ Exception -> 0x00b2 }
            boolean r0 = r0.contains(r6)     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "blacklisted_decoders_4.2"
            X.0wb.A03(r0, r6)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x004c
        L_0x0045:
            boolean r0 = r3.contains(r6)     // Catch:{ Exception -> 0x00b2 }
            if (r0 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x0019
        L_0x004f:
            r12 = 0
            if (r6 == 0) goto L_0x009e
            r0 = 1543809183(0x5c04a89f, float:1.49360391E17)
            android.media.MediaCodec r8 = X.0fX.A00(r6, r0)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r0 = "max-input-size"
            r15.setInteger(r0, r12)     // Catch:{ Exception -> 0x0093 }
            r8.getName()     // Catch:{ RuntimeException -> 0x007b }
            r13 = -1934378656(0xffffffff8cb3b960, float:-2.7690885E-31)
            r11 = r16
            X.0fX.A07(r8, r9, r10, r11, r12, r13)     // Catch:{ RuntimeException -> 0x007b }
            r0 = 0
            if (r16 == 0) goto L_0x006e
            r0 = 1
        L_0x006e:
            X.Q0p r1 = new X.Q0p     // Catch:{ Exception -> 0x0093 }
            r5 = r17
            r1.<init>(r8, r5, r0)     // Catch:{ Exception -> 0x0093 }
            android.media.MediaCodec r0 = r1.A03     // Catch:{ Exception -> 0x00b2 }
            r0.getName()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00c6
        L_0x007b:
            r7 = move-exception
            java.lang.String r1 = X.SL2.A01(r8, r15)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r0 = "decoder_init_error_details"
            X.0wb.A06(r0, r1, r7)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = r8.getName()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = r15.toString()     // Catch:{ Exception -> 0x0093 }
            X.RBe r0 = new X.RBe     // Catch:{ Exception -> 0x0093 }
            r0.<init>(r5, r1, r7)     // Catch:{ Exception -> 0x0093 }
            throw r0     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            r5 = move-exception
            java.lang.String r1 = r15.toString()     // Catch:{ Exception -> 0x00b2 }
            X.RBe r0 = new X.RBe     // Catch:{ Exception -> 0x00b2 }
            r0.<init>(r6, r1, r5)     // Catch:{ Exception -> 0x00b2 }
            throw r0     // Catch:{ Exception -> 0x00b2 }
        L_0x009e:
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r3}     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r1 = "MediaCodecFactory"
            java.lang.String r0 = "no decoder found %s, block list %s"
            X.0KC.A0O(r1, r0, r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r1 = "No decoder can be found"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x00b2 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00b2 }
            throw r0     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            boolean r0 = r1 instanceof X.C8828RBe
            if (r0 == 0) goto L_0x00bc
            r0 = r1
            X.RBe r0 = (X.C8828RBe) r0
            java.lang.String r9 = r0.A00
        L_0x00bc:
            if (r2 > r4) goto L_0x00cd
            if (r9 == 0) goto L_0x00c3
            r3.add(r9)
        L_0x00c3:
            r0 = r2
            goto L_0x0007
        L_0x00c6:
            return r1
        L_0x00c7:
            java.lang.String r0 = "Method either return a codec or throw an init exception"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
        L_0x00cd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7241Q0n.A00(android.media.MediaFormat, android.view.Surface, com.instagram.common.session.UserSession, java.util.List):X.Q0p");
    }

    static {
        HashSet A1F = AnonymousClass7TE.A1F();
        A00 = A1F;
        A1F.add("OMX.ittiam.video.decoder.avc");
        A1F.add("OMX.Exynos.AVC.Decoder");
    }

    public final C7243Q0p A01(MediaFormat mediaFormat, UserSession userSession) {
        Exception exc;
        Throwable th;
        String string;
        Object obj;
        String str;
        MediaFormat mediaFormat2 = mediaFormat;
        String string2 = mediaFormat2.getString("mime");
        string2.getClass();
        02m A0l = C51965G9l.A0l();
        ArrayList A002 = C9860RiZ.A00(string2);
        0qQ.A0B(A002, 2);
        A0l.markerStart(54460417);
        A0l.markerAnnotate(54460417, "mime", string2);
        A0l.markerAnnotate(54460417, "format", mediaFormat2.toString());
        A0l.markerAnnotate(54460417, "codec_candidates", (String[]) PzX.A00(A002).A03());
        if (string2.equals("video/avc") || string2.equals("video/hevc")) {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = 0fX.A02(string2, 1821076643);
                if (mediaFormat2.containsKey("profile") && mediaFormat2.getInteger("profile") == 8) {
                    string = mediaFormat2.getString("mime");
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodec.getCodecInfo().getCapabilitiesForType(string).profileLevels;
                    codecProfileLevelArr.getClass();
                    HashMap A1E = AnonymousClass7TE.A1E();
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (C51968G9o.A0z(A1E, codecProfileLevel.profile) == null) {
                            A1E.put(Integer.valueOf(codecProfileLevel.profile), AnonymousClass7TE.A1F());
                        }
                        Object A0z = C51968G9o.A0z(A1E, codecProfileLevel.profile);
                        A0z.getClass();
                        ((Set) A0z).add(Integer.valueOf(codecProfileLevel.level));
                    }
                    Integer valueOf = Integer.valueOf(mediaFormat2.getInteger("profile"));
                    if (A1E.containsKey(valueOf)) {
                        if (mediaFormat2.containsKey("level") && !Pxf.A1U((Set) A1E.get(valueOf), mediaFormat2.getInteger("level"))) {
                            obj = A1E.get(valueOf);
                        }
                    } else if (A1E.containsKey(2)) {
                        mediaFormat2.setInteger("profile", 2);
                        obj = A1E.get(2);
                    }
                    mediaFormat2.setInteger("level", Pxe.A09(((Set) obj).iterator().next()));
                }
            } catch (RuntimeException e) {
                0wb.A06("encoder_init_error_details", SL2.A01(mediaCodec, mediaFormat2), e);
                if (e instanceof MediaCodec.CodecException) {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) e;
                    0wb.A06("encoder_codec_exception_details", SL2.A00(codecException), e);
                    0qQ.A0B(codecException, 0);
                    int errorCode = codecException.getErrorCode();
                    if (errorCode == Integer.MIN_VALUE) {
                        th = new RLB(codecException, "");
                    } else if (errorCode == -2147479551) {
                        th = new RLB(codecException, "");
                    } else if (errorCode == -2147479543) {
                        th = new RLB(codecException, "");
                    } else if (errorCode == -1622321339) {
                        th = new RLB(codecException, "");
                    } else if (errorCode == -5001) {
                        th = new RLB(codecException, "");
                    } else if (errorCode == -1021) {
                        th = new RLB(codecException, "");
                    } else if (errorCode == -1010) {
                        th = new RLB(codecException, "ERROR_UNSUPPORTED - Configure was probably called with some unsupported parameters.");
                    } else if (errorCode == -32) {
                        th = new RLB(codecException, "");
                    } else if (errorCode == -12) {
                        th = new RLB(codecException, "");
                    } else if (errorCode == 1100) {
                        th = new RLB(codecException, "This indicates required resource was not able to be allocated.");
                    } else if (errorCode != 1101) {
                        0wb.A03("CodecExceptionUtil", 002.A0O("Uncategorized error with code:", codecException.getErrorCode()));
                        if (codecException.isRecoverable()) {
                            th = new RLB(codecException, "Codec cannot proceed, but can be fixed by stopping, configuring, and starting again");
                        } else if (codecException.isTransient()) {
                            th = new RLB(codecException, "Codec cannot proceed, try again later.");
                        } else {
                            th = codecException;
                        }
                    } else {
                        th = new RLB(codecException, "Resource manager reclaimed to media resource used by the codec. You must release the codec");
                    }
                    throw th;
                }
                throw e;
            } catch (IllegalStateException e2) {
                0wb.A06("check_and_adjust_output_format_error", StringFormatUtil.formatStrLocaleSafe("Failed to get profile levels. media codec:%s mimeType:%s outputFormat:%s", mediaCodec.getName(), string, mediaFormat2), e2);
            } catch (Throwable th2) {
                String obj2 = mediaFormat2.toString();
                if (mediaCodec != null) {
                    obj2 = SL2.A01(mediaCodec, mediaFormat2);
                }
                String message = th2.getMessage();
                if (th2 instanceof MediaCodec.CodecException) {
                    message = SL2.A00(th2);
                }
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("codecInfo=%s, exceptionInfo=%s", obj2, message);
                exc = new Exception(formatStrLocaleSafe, th2);
                0wb.A01(0kg.A03, "media_codec_factory_create_encoder", formatStrLocaleSafe);
                0KC.A0O("MediaCodecFactory", "::createEncoder error. Debug information: %s", new Object[]{formatStrLocaleSafe, th2});
                if (mediaCodec != null) {
                    A0l.markerAnnotate(54460417, "details", SL2.A01(mediaCodec, mediaFormat2));
                }
            }
            mediaCodec.getName();
            0fX.A07(mediaCodec, (MediaCrypto) null, mediaFormat2, (Surface) null, 1, -879956188);
            C7243Q0p q0p = new C7243Q0p(mediaCodec, userSession, false);
            String name = mediaCodec.getName();
            0qQ.A0B(name, 0);
            A0l.markerAnnotate(54460417, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, name);
            A0l.markerEnd(54460417, 2);
            return q0p;
        }
        0KC.A0O("MediaCodecFactory", "unsupported encoder mimetype %s", new Object[]{string2});
        exc = new Exception(002.A0R("Unsupported codec for ", string2));
        String message2 = exc.getMessage();
        if (message2 == null) {
            message2 = "null_message";
        }
        A0l.markerAnnotate(54460417, "error", message2);
        Throwable cause = exc.getCause();
        if (cause == null || (str = cause.getMessage()) == null) {
            str = "null_cause";
        }
        Pxf.A1I(A0l, "cause", str, 54460417);
        throw exc;
    }
}
