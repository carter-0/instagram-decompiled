package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.effect.AREffect;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8VZ  reason: invalid class name */
public final class AnonymousClass8VZ {
    public Rect A00;
    public C362868ic A01;
    public final C357638Yz A02;
    public final AnonymousClass80D A03;
    public final Activity A04;
    public final AnonymousClass82W A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final AnonymousClass8QN A08;
    public final AnonymousClass8K4 A09;
    public final TargetViewSizeProvider A0A;
    public final C352888Fl A0B;
    public final C3499582p A0C;
    public final AnonymousClass8DO A0D;
    public final AnonymousClass8E5 A0E;
    public final AnonymousClass80U A0F;
    public final ClipsCreationViewModel A0G;
    public final C3495780x A0H;

    public final void A03(C352218Cl r48, boolean z) {
        Location location;
        int width;
        int height;
        int height2;
        int width2;
        int i;
        int i2;
        Rect rect;
        OpenCarouselCaptureConfig openCarouselCaptureConfig;
        C61058Jvw jvw;
        Double d;
        Double d2;
        Long l;
        Long l2;
        ArrayList arrayList;
        Long l3;
        Long l4;
        ArrayList A0B2;
        Long l5;
        int i3;
        PromptStickerModel promptStickerModel;
        String str;
        long j;
        long j2;
        C352218Cl r8 = r48;
        int i4 = r8.A08;
        if (i4 == 1) {
            List singletonList = Collections.singletonList(this.A05.A00().A05.A09);
            0qQ.A07(singletonList);
            Double d3 = null;
            Float f = r8.A0O;
            if (f != null) {
                d = C364198l1.A00((double) f.floatValue());
            } else {
                d = null;
            }
            Long l6 = r8.A0W;
            if (l6 != null) {
                d2 = C364198l1.A00(((double) l6.longValue()) / 1.0E9d);
                if (d2 != null) {
                    d3 = C364198l1.A00(-(Math.log(d2.doubleValue()) / C343597qT.A00));
                }
            } else {
                d2 = null;
            }
            Integer num = r8.A0T;
            if (num != null) {
                0qQ.A07(Collections.singletonList(Long.valueOf((long) num.intValue())));
            }
            Integer num2 = r8.A0S;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            j2 = 2;
                        } else if (intValue != 3) {
                            j2 = -1;
                        }
                    }
                    j2 = 1;
                } else {
                    j2 = 0;
                }
                l = Long.valueOf(j2);
            } else {
                l = null;
            }
            Integer num3 = r8.A0V;
            Boolean bool = r8.A0N;
            if (bool != null) {
                if (bool.booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                l2 = Long.valueOf(j);
            } else {
                l2 = null;
            }
            Integer num4 = r8.A0U;
            AnonymousClass8l2 r7 = null;
            if (num4 != null) {
                int intValue2 = num4.intValue();
                if (intValue2 == 0 || intValue2 == 1) {
                    r7 = AnonymousClass8l2.AUTO;
                } else if (intValue2 == 5) {
                    r7 = AnonymousClass8l2.NIGHT;
                } else if (intValue2 == 17) {
                    r7 = AnonymousClass8l2.HDR;
                }
            }
            UserSession userSession = this.A07;
            0qQ.A06(userSession);
            28t r11 = 28t.A05;
            AnonymousClass80D r4 = this.A03;
            String str2 = r4.A2J;
            Integer valueOf = Integer.valueOf(r8.A00);
            AnonymousClass8DO r3 = this.A0D;
            C357638Yz r5 = this.A02;
            Integer A082 = r5.A08();
            List A0a = 00k.A0a((Iterable) r5.A09.A00);
            C279284yO r10 = (C279284yO) r5.A08.A00;
            TargetViewSizeProvider targetViewSizeProvider = this.A0A;
            String moduleName = this.A06.getModuleName();
            AnonymousClass831 r0 = (AnonymousClass831) this.A0G.A0G.A02();
            if (r0 != null) {
                arrayList = 2AL.A0C(r0.A05());
            } else {
                arrayList = null;
            }
            C3499382n r02 = r4.A12;
            if (r02 == null || (promptStickerModel = r02.A01) == null || (str = promptStickerModel.A03) == null) {
                l3 = null;
            } else {
                l3 = 00y.A0n(10, str);
            }
            0qQ.A0B(r10, 8);
            0qQ.A0B(moduleName, 15);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (Object next : singletonList) {
                AREffect aREffect = (AREffect) next;
                if (aREffect != null && aREffect.A0D()) {
                    arrayList6.add(next);
                }
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                CameraAREffect cameraAREffect = (CameraAREffect) it.next();
                if (cameraAREffect != null) {
                    String str3 = cameraAREffect.A0B;
                    if (str3 != null) {
                        arrayList5.add(str3);
                    }
                    String str4 = cameraAREffect.A0K;
                    0qQ.A07(str4);
                    arrayList2.add(str4);
                    String str5 = cameraAREffect.A0M;
                    0qQ.A0A(str5);
                    arrayList3.add(str5);
                    String str6 = cameraAREffect.A0K;
                    0qQ.A07(str6);
                    Integer B09 = r3.B09(str6);
                    if (B09 != null) {
                        i3 = B09.intValue();
                    } else {
                        i3 = AnonymousClass972.MUTABLE_FLAG_MASK;
                    }
                    arrayList4.add(Integer.valueOf(i3));
                    if (B09 == null) {
                        0kD.A07("CameraLoggerHelper", 002.A0R("Unable to find effect position for effect: ", cameraAREffect.A0K), (Throwable) null);
                    }
                }
            }
            29f r6 = 27p.A01(userSession).A0A;
            int A032 = C59895JbK.A03(valueOf);
            int A012 = 2AL.A01(A082);
            C59725JVj A083 = C59895JbK.A08(A082, true);
            0qQ.A0B(A083, 6);
            AnonymousClass283 r42 = r6.A04;
            r42.A0A = r11;
            boolean z2 = true;
            if (A012 != 2 && A032 == -1) {
                String format = String.format("logCameraCapture() cameraPosition is unknown: entryPoint=%s mediaType=%d, captureFormat=%d, cameraSurface=%d ", Arrays.copyOf(new Object[]{r42.A09, 1L, Integer.valueOf(A012), Long.valueOf(A083.A00)}, 4));
                0qQ.A07(format);
                0kD.A07("IgCameraBaseFalcoLoggerImpl", format, (Throwable) null);
            }
            if (!29f.A06(r11, r10, A0a)) {
                String format2 = String.format("logCameraCapture() mediaType is not valid: entryPoint=%s mediaType=%d, captureFormat=%d, cameraSurface=%d cameraPosition=%d", Arrays.copyOf(new Object[]{r42.A09, 1L, Integer.valueOf(A012), Long.valueOf(A083.A00), Integer.valueOf(A032)}, 5));
                0qQ.A07(format2);
                l4 = null;
                0kD.A07("IgCameraBaseFalcoLoggerImpl", format2, (Throwable) null);
            } else {
                l4 = null;
            }
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            if (!arrayList2.isEmpty() && arrayList2.size() == arrayList3.size()) {
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    String str7 = (String) 00k.A0O(arrayList2, i5);
                    if (str7 != null) {
                        l5 = 00y.A0n(10, str7);
                    } else {
                        l5 = l4;
                    }
                    String str8 = (String) 00k.A0O(arrayList3, i5);
                    if (str8 != null) {
                        l4 = 00y.A0n(10, str8);
                    }
                    if (!(l5 == null || l4 == null)) {
                        arrayList7.add(l5);
                        arrayList8.add(l4);
                    }
                    i5++;
                    l4 = null;
                }
            }
            int i6 = 2;
            if (A032 != 2) {
                i6 = 1;
            }
            0wc r2 = r6.A01;
            1Ln r22 = new 1Ln(r2.A00(r2.A00, "ig_camera_capture"), 196);
            if (arrayList == null) {
                A0B2 = r6.A0N(0);
            } else {
                A0B2 = 2AL.A0B(arrayList);
            }
            String str9 = r42.A0L;
            if (r22.A00.isSampled() && str9 != null) {
                r22.A0S("applied_effect_ids", arrayList7);
                r22.A0S("applied_effect_instance_ids", arrayList8);
                r22.A0V(i6);
                r22.A0R("camera_session_id", str9);
                r22.A0S("camera_tools", r6.A0O(A0a, (List) null, (List) null, false, false));
                r22.A0S("camera_tools_struct", A0B2);
                r22.A0Q("capture_format_index", 0L);
                r22.A0M(r6.A0I(), "capture_type");
                r22.A0M(r42.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                r22.A0W(2);
                r22.A0c(r11);
                r22.A0n(moduleName);
                r22.A0M(A083, "surface");
                r22.A0a(r10.A00);
                r22.A0M(C358168aT.A00(targetViewSizeProvider), "nine_sixteen_layout_config");
                r22.A0Q("media_id", 27x.A0F(str2));
                r22.A0R("discovery_session_id", r42.A0O);
                r22.A00.A9H("effect_indices", 29f.A04(arrayList2, arrayList4));
                r22.A0Q("audio_asset_id", (Long) null);
                r22.A0R("composition_str_id", r42.A0M);
                r22.A0M(r11, "composition_media_type");
                r22.A0S("preloaded_audio_asset_id", r6.A01);
                r22.A0S("preloaded_effect_id", r6.A02);
                r22.A0S("preloaded_media_id", r6.A03);
                r22.A0O("is_panavision", false);
                r22.A0u(AnonymousClass1QI.A00.A02.A00);
                r22.A0R("source_media_id", r6.A00);
                r22.A0N(2AL.A07(r6.A00, r6.A03), "system_info");
                r22.A0P("aperture", d);
                r22.A0P("exposure_time", d2);
                r22.A0P("shutter_speed", d3);
                r22.A0Q("flash_mode", l);
                if (num3 == null || num3.intValue() == 0) {
                    z2 = false;
                }
                r22.A0O("did_zoom", Boolean.valueOf(z2));
                r22.A0Q("flash_status", l2);
                r22.A0M(r7, "scene_mode");
                C342197oC r1 = r42.A06;
                if (r1 != null) {
                    r22.A0M(r1, "folding_state");
                }
                if (l3 != null) {
                    r22.A0Q(AnonymousClass000.A00(1179), l3);
                }
                r22.Cgf();
            }
        } else if (i4 == 0 && !(this.A02.A08.A00 instanceof AnonymousClass80O)) {
            UserSession userSession2 = this.A07;
            0qQ.A06(userSession2);
            29f r62 = 27p.A01(userSession2).A0A;
            C360948fP r24 = C360948fP.GALLERY;
            int i7 = r8.A09;
            int i8 = r8.A06;
            String A062 = r8.A06();
            Boolean valueOf2 = Boolean.valueOf(z);
            long j3 = r8.A0B;
            if (j3 <= 0) {
                j3 = r8.A0A;
            }
            r62.A0W((C391579tJ) null, r24, false, valueOf2, (Double) null, (Long) null, (Long) null, A062, 1, i7, i8, j3 / 1000, false);
        }
        28D r25 = this.A0H.A00;
        if (C348017xk.A02(r25) && (jvw = C365768ne.A0A.A00().A02) != null) {
            String str10 = r8.A01().A03;
            if (str10 == null || str10.length() == 0) {
                r8.A01().A03 = jvw.A04;
                r8.A01().A04 = jvw.A05;
                r8.A0Z = jvw.A02;
            }
            String str11 = jvw.A04;
            if (str11 != null && (00l.A0d(str11, "com.facebook.stella", false) || 00l.A0d(str11, "com.facebook.mwa.ai", false))) {
                r8.A08 = 110;
            }
        }
        AnonymousClass80U r23 = this.A0F;
        UserSession userSession3 = this.A07;
        0qQ.A06(userSession3);
        C364688lp.A00(r23);
        C3494680m r03 = this.A02.A08;
        C3494680m r222 = r03;
        Object obj = r03.A00;
        C363138jC r19 = C363138jC.A00;
        if (0qQ.A0K(obj, r19) || ((openCarouselCaptureConfig = this.A03.A0b) != null && openCarouselCaptureConfig.A00 > 0.0f)) {
            Rect rect2 = this.A00;
            Rect rect3 = rect2;
            if (rect2 != null) {
                C352888Fl r26 = this.A0B;
                C340297l2 r04 = r26.A06;
                if (r04 != null) {
                    width = r04.A0H.A00().getWidth();
                } else {
                    width = r26.A0T.getWidth();
                }
                C340297l2 r12 = r26.A06;
                if (r12 != null) {
                    height = r12.A0H.A00().getHeight();
                } else {
                    height = r26.A0T.getHeight();
                }
                Rect A002 = r8.A00();
                if (A002 != null) {
                    int i9 = r8.A07;
                    if (i9 == 90 || i9 == 270) {
                        height2 = A002.height();
                    } else {
                        height2 = A002.width();
                    }
                    if (i9 == 90 || i9 == 270) {
                        width2 = A002.width();
                    } else {
                        width2 = A002.height();
                    }
                    double d4 = ((double) height2) / ((double) width);
                    double d5 = ((double) width2) / ((double) height);
                    if (i9 == 90 || i9 == 270) {
                        i = A002.top;
                    } else {
                        i = A002.left;
                    }
                    if (i9 == 90 || i9 == 270) {
                        i2 = A002.left;
                    } else {
                        i2 = A002.top;
                    }
                    double d6 = ((double) rect3.top) * d5;
                    double d7 = ((double) rect3.left) * d4;
                    rect = new Rect(AnonymousClass1GB.A00(d7) + i, AnonymousClass1GB.A00(d6) + i2, AnonymousClass1GB.A00(d7 + (((double) rect3.width()) * d4) + ((double) i)), AnonymousClass1GB.A00(d6 + (((double) rect3.height()) * d5) + ((double) i2)));
                    if (i9 == 90 || i9 == 270) {
                        rect.set(rect.top, rect.left, rect.bottom, rect.right);
                    }
                } else if (z) {
                    int i10 = r8.A09;
                    int i11 = r8.A06;
                    rect = new Rect();
                    int min = Math.min(i10, i11);
                    if (min == i10) {
                        rect.left = 0;
                        int i12 = (i11 - min) / 2;
                        rect.top = i12;
                        rect.right = min;
                        rect.bottom = i12 + min;
                    } else {
                        int i13 = (i10 - min) / 2;
                        rect.left = i13;
                        rect.top = 0;
                        rect.right = i13 + min;
                        rect.bottom = min;
                    }
                } else {
                    0kD.A07("QCC", "Feed photo flow has a null crop rectangle", (Throwable) null);
                }
                r8.A03 = rect.left;
                r8.A05 = rect.top;
                r8.A04 = rect.right;
                r8.A02 = rect.bottom;
            }
            if (r222.A00 == r19) {
                JWU jwu = new JWU(AnonymousClass36W.FOLLOWERS_SHARE);
                AnonymousClass80D r13 = this.A03;
                jwu.A04 = r13.A3O;
                jwu.A00 = r13.A1N;
                MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(jwu);
                Activity activity = this.A04;
                0qQ.A06(activity);
                PendingRecipient pendingRecipient = this.A0C.A02.A01.A0i;
                Medium medium = r8.A0F;
                if (medium != null) {
                    location = new Location("photo");
                    ContentResolver contentResolver = activity.getContentResolver();
                    0qQ.A07(contentResolver);
                    double[] A072 = medium.A07(contentResolver);
                    if (A072 != null) {
                        location.setLatitude(A072[0]);
                        location.setLatitude(A072[1]);
                    }
                } else {
                    location = null;
                }
                String A073 = r8.A07();
                Rect A003 = r8.A00();
                if (A003 == null) {
                    A003 = new Rect(0, 0, r8.A09, r8.A06);
                }
                CropInfo cropInfo = new CropInfo(A003, r8.A09, r8.A06);
                String A063 = r8.A06();
                boolean z3 = r8.A13;
                int i14 = r8.A07;
                0qQ.A0B(A063, 2);
                LI1.A00(activity, location, (Uri) null, r25, new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false), userSession3, cropInfo, (C3499582p) null, mediaCaptureConfig, pendingRecipient, A063, A073, i14, 1, z3, false);
                return;
            }
        }
        r23.E3H(new AnonymousClass8SN(this.A03.A0w, r8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r1 == X.AnonymousClass80M.A00) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C349307zv r9) {
        /*
            r8 = this;
            r3 = 0
            X.0qQ.A0B(r9, r3)
            X.8Yz r0 = r8.A02
            X.80m r6 = r0.A08
            java.lang.Object r1 = r6.A00
            X.8jC r0 = X.C363138jC.A00
            r7 = 0
            if (r1 != r0) goto L_0x0010
            r7 = 1
        L_0x0010:
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 == r0) goto L_0x0019
            X.80M r0 = X.AnonymousClass80M.A00
            r5 = 0
            if (r1 != r0) goto L_0x001a
        L_0x0019:
            r5 = 1
        L_0x001a:
            X.80D r4 = r8.A03
            boolean r0 = r4.A3L
            if (r0 == 0) goto L_0x0048
            if (r5 != 0) goto L_0x0048
            if (r7 != 0) goto L_0x0048
            X.0wj r2 = X.0wj.A01
            r1 = 817901047(0x30c02df7, float:1.3982903E-9)
            java.lang.String r0 = "CapturedMediaProcessor"
            X.0f9 r2 = r2.AEf(r0, r1)
            X.28D r0 = r4.A0B
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "entry_point"
            r2.ABQ(r0, r1)
            java.lang.Object r0 = r6.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "camera_destination"
            r2.ABQ(r0, r1)
            r2.report()
        L_0x0048:
            boolean r0 = r4.A3L
            if (r0 == 0) goto L_0x0089
            if (r5 != 0) goto L_0x0089
            if (r7 != 0) goto L_0x0089
            java.lang.String r0 = r9.A0k
            X.JYp r0 = X.C59796JYp.A01(r0, r3)
            X.0qQ.A07(r0)
            long r4 = r0.A03
            r1 = 15500(0x3c8c, double:7.658E-320)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0089
            r2 = 10
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 15000(0x3a98, float:2.102E-41)
            java.util.ArrayList r2 = X.C39820AAr.A01(r9, r2, r0, r1)
        L_0x006b:
            X.8E5 r0 = r8.A0E
            X.8Zl r0 = r0.A00()
            r0.Cmf(r2)
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x0091
            java.lang.Object r1 = X.00k.A0O(r2, r3)
            X.7zv r1 = (X.C349307zv) r1
            if (r1 == 0) goto L_0x0088
            X.8ni r0 = X.C365808ni.A00
            r8.A01(r0, r1, r3)
        L_0x0088:
            return
        L_0x0089:
            java.util.List r2 = java.util.Collections.singletonList(r9)
            X.0qQ.A07(r2)
            goto L_0x006b
        L_0x0091:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r8.A05(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VZ.A04(X.7zv):void");
    }

    public final void A05(Integer num, List list) {
        C362868ic r0 = this.A01;
        if (r0 != null) {
            r0.A01(false);
        }
        this.A0C.A02.A08(num);
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C365798nh((C349307zv) it.next()));
        }
        AnonymousClass8QN r02 = this.A08;
        r02.A0A(arrayList);
        r02.A0B(arrayList);
    }

    public final void A00(C365798nh r4) {
        if (r4.A05.ordinal() != 0) {
            C349307zv r1 = r4.A03;
            if (r1 != null) {
                A01(C365808ni.A00, r1, false);
                return;
            }
            return;
        }
        C352218Cl r0 = r4.A02;
        if (r0 != null) {
            A03(r0, false);
        }
    }

    public final void A01(C353538Ia r51, C349307zv r52, boolean z) {
        String str;
        ArrayList arrayList;
        Long l;
        int i;
        PromptStickerModel promptStickerModel;
        String str2;
        C353538Ia r12 = r51;
        0qQ.A0B(r12, 2);
        C349307zv r1 = r52;
        int i2 = r1.A0F;
        if (i2 == 1) {
            List list = r1.A0u;
            if (list == null) {
                list = Collections.singletonList(this.A05.A00().A05.A09);
                0qQ.A07(list);
            }
            MusicOverlayStickerModel musicOverlayStickerModel = r1.A0V;
            if (musicOverlayStickerModel != null) {
                str = musicOverlayStickerModel.A0S;
            } else {
                str = null;
            }
            UserSession userSession = this.A07;
            0qQ.A06(userSession);
            28t r22 = 28t.A06;
            AnonymousClass80D r5 = this.A03;
            String str3 = r5.A2J;
            Integer valueOf = Integer.valueOf(r1.A01);
            AnonymousClass8DO r11 = this.A0D;
            C357638Yz r7 = this.A02;
            Integer A082 = r7.A08();
            ArrayList arrayList2 = new ArrayList((Collection) r7.A09.A00);
            C279284yO r8 = (C279284yO) r7.A08.A00;
            TargetViewSizeProvider targetViewSizeProvider = this.A0A;
            String moduleName = this.A06.getModuleName();
            AnonymousClass831 r3 = (AnonymousClass831) this.A0G.A0F.A02();
            if (r3 != null) {
                arrayList = 2AL.A0C(r3.A05());
            } else {
                arrayList = null;
            }
            C3499382n r32 = r5.A12;
            if (r32 == null || (promptStickerModel = r32.A01) == null || (str2 = promptStickerModel.A03) == null) {
                l = null;
            } else {
                l = 00y.A0n(10, str2);
            }
            0qQ.A0B(list, 3);
            0qQ.A0B(r8, 8);
            0qQ.A0B(moduleName, 15);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            for (Object next : list) {
                AREffect aREffect = (AREffect) next;
                if (aREffect != null && aREffect.A0D()) {
                    arrayList7.add(next);
                }
            }
            Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                CameraAREffect cameraAREffect = (CameraAREffect) it.next();
                if (cameraAREffect != null) {
                    String str4 = cameraAREffect.A0B;
                    if (str4 != null) {
                        arrayList6.add(str4);
                    }
                    String str5 = cameraAREffect.A0K;
                    0qQ.A07(str5);
                    arrayList3.add(str5);
                    String str6 = cameraAREffect.A0M;
                    0qQ.A0A(str6);
                    arrayList4.add(str6);
                    String str7 = cameraAREffect.A0K;
                    0qQ.A07(str7);
                    Integer B09 = r11.B09(str7);
                    if (B09 != null) {
                        i = B09.intValue();
                    } else {
                        i = AnonymousClass972.MUTABLE_FLAG_MASK;
                    }
                    arrayList5.add(Integer.valueOf(i));
                    if (B09 == null) {
                        0kD.A07("CameraLoggerHelper", 002.A0R("Unable to find effect position for effect: ", cameraAREffect.A0K), (Throwable) null);
                    }
                }
            }
            29f r2 = 27p.A01(userSession).A0A;
            29f r21 = r2;
            C279284yO r24 = r8;
            r21.A0b(r22, C59895JbK.A08(A082, true), r24, targetViewSizeProvider, l, str3, str, moduleName, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList, C59895JbK.A03(valueOf), 2AL.A01(A082));
        } else if (i2 == 0 && !(this.A02.A08.A00 instanceof AnonymousClass80O)) {
            UserSession userSession2 = this.A07;
            0qQ.A06(userSession2);
            29f r9 = 27p.A01(userSession2).A0A;
            C360948fP r37 = C360948fP.GALLERY;
            int i3 = r1.A0K;
            int i4 = r1.A08;
            Long valueOf2 = Long.valueOf(r1.A00());
            String str8 = r1.A0k;
            Double valueOf3 = Double.valueOf(((double) r1.A07) / 1000.0d);
            Boolean valueOf4 = Boolean.valueOf(z);
            long j = r1.A0M;
            if (j <= 0) {
                j = r1.A0L;
            }
            r9.A0W((C391579tJ) null, r37, false, valueOf4, valueOf3, valueOf2, (Long) null, str8, 2, i3, i4, j / 1000, false);
        }
        28D r10 = this.A0H.A00;
        if (C348017xk.A02(r10)) {
            C61058Jvw jvw = C365768ne.A0A.A00().A02;
            if (jvw != null) {
                String str9 = r1.A02().A03;
                if (str9 == null || str9.length() == 0) {
                    r1.A02().A03 = jvw.A04;
                    r1.A02().A04 = jvw.A05;
                    r1.A0e = jvw.A02;
                }
                String str10 = jvw.A04;
                if (str10 != null && 00l.A0d(str10, "com.facebook.stella", false)) {
                    r1.A0F = 110;
                }
            }
        } else if (r10 == 28D.A5H) {
            C365768ne A002 = C365768ne.A0A.A00();
            r1.A02().A03 = A002.A06;
        }
        if (this.A02.A08.A00 == C363138jC.A00) {
            JWU jwu = new JWU(AnonymousClass36W.FOLLOWERS_SHARE);
            AnonymousClass80D r33 = this.A03;
            jwu.A04 = r33.A3O;
            jwu.A00 = r33.A1N;
            MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(jwu);
            Activity activity = this.A04;
            0qQ.A06(activity);
            UserSession userSession3 = this.A07;
            0qQ.A06(userSession3);
            PendingRecipient pendingRecipient = this.A0C.A02.A01.A0i;
            if (ABQ.A01(new C59796JYp(r1.A0k, r1.A01, (long) r1.A07, false), new AnonymousClass7IH(activity), true, true)) {
                List singletonList = Collections.singletonList(C282665Eg.A03(C39907AIy.A00(2Nm.A00(activity, userSession3), new File(r1.A0k)), 3, 0));
                0qQ.A07(singletonList);
                C250563lf.A0L(activity, r10, userSession3, mediaCaptureConfig.A00, pendingRecipient, (String) null, (String) null, singletonList, mediaCaptureConfig.A04);
                return;
            }
            return;
        }
        AnonymousClass80U r23 = this.A0F;
        r23.E3H(new AnonymousClass8SO(r12, r1));
        if (r12 instanceof C367128qE) {
            r23.E3H(new C356208Sz(C390839rv.POST_CAPTURE, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, false, false));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0051: MOVE  (r6v3 androidx.fragment.app.FragmentActivity) = (r6v2 androidx.fragment.app.FragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A02(X.C351818An r23, X.C352218Cl r24) {
        /*
            r22 = this;
            r21 = 0
            r2 = r22
            X.80U r1 = r2.A0F
            X.8Ti r0 = new X.8Ti
            r0.<init>()
            r1.E3H(r0)
            X.8K4 r0 = r2.A09
            X.8KK r0 = r0.A0M
            r11 = r24
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r0.A05(r11)
            X.4a5 r0 = r0.A00()
            float r5 = r0.A02
            float r4 = r0.A03
            float r3 = r0.A01
            float r1 = r0.A04
            float r0 = r0.A05
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r15 = new com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform
            r17 = r4
            r18 = r3
            r19 = r1
            r20 = r0
            r16 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            X.80D r1 = r2.A03
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r1.A1h
            r3 = 0
            if (r4 == 0) goto L_0x00b1
            com.instagram.api.schemas.StoryPromptType r6 = r4.A03()
        L_0x0040:
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            r5 = 0
            if (r6 != r0) goto L_0x0046
            r5 = 1
        L_0x0046:
            com.instagram.common.session.UserSession r8 = r2.A07
            X.0qQ.A06(r8)
            android.app.Activity r6 = r2.A04
            boolean r0 = r6 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x00a6
            androidx.fragment.app.FragmentActivity r6 = (androidx.fragment.app.FragmentActivity) r6
            if (r6 == 0) goto L_0x00a6
            com.instagram.api.schemas.GenAIToolInfoDict r0 = r1.A0I
            if (r0 == 0) goto L_0x00a6
            com.instagram.api.schemas.CameraTool r7 = r0.A00
            if (r7 == 0) goto L_0x00a6
            boolean r14 = r1.A3R
            java.lang.String r13 = r0.A03
            if (r13 == 0) goto L_0x0065
            if (r5 == 0) goto L_0x0066
        L_0x0065:
            r13 = r3
        L_0x0066:
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r2 = r2.A0A
            if (r4 == 0) goto L_0x00ae
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r4.A00
            java.lang.String r17 = r0.getText()
        L_0x0072:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.A1h
            if (r0 == 0) goto L_0x00ab
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = r0.B91()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r18 = r0.Bhm()
        L_0x0082:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.A1h
            if (r0 == 0) goto L_0x00a9
            java.lang.String r4 = r0.A03
        L_0x0088:
            com.instagram.api.schemas.GenAIToolInfoDict r0 = r1.A0I
            if (r0 == 0) goto L_0x00a7
            java.lang.String r1 = r0.A02
        L_0x008e:
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r0 = new com.instagram.creation.genai.magicmod.model.MagicModTopicInfo
            r19 = r4
            r20 = r1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            if (r5 != 0) goto L_0x009c
            r0 = r3
        L_0x009c:
            com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r9 = new com.instagram.creation.genai.magicmod.model.MagicModLaunchParams
            r9.<init>(r2, r3, r15, r0)
            r10 = r23
            X.HYO.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00a6:
            return
        L_0x00a7:
            r1 = r3
            goto L_0x008e
        L_0x00a9:
            r4 = r3
            goto L_0x0088
        L_0x00ab:
            r18 = r3
            goto L_0x0082
        L_0x00ae:
            r17 = r3
            goto L_0x0072
        L_0x00b1:
            r6 = r3
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VZ.A02(X.8An, X.8Cl):void");
    }

    public AnonymousClass8VZ(AnonymousClass82W r2, AnonymousClass0iw r3, C357638Yz r4, AnonymousClass8QN r5, AnonymousClass8K4 r6, TargetViewSizeProvider targetViewSizeProvider, C352888Fl r8, C3499582p r9, AnonymousClass80D r10, AnonymousClass8DO r11, AnonymousClass8E5 r12, AnonymousClass80U r13, ClipsCreationViewModel clipsCreationViewModel, C3495780x r15) {
        this.A03 = r10;
        this.A06 = r3;
        this.A05 = r2;
        this.A0D = r11;
        this.A0B = r8;
        this.A02 = r4;
        this.A0F = r13;
        this.A0E = r12;
        this.A0H = r15;
        this.A0C = r9;
        this.A08 = r5;
        this.A0G = clipsCreationViewModel;
        this.A0A = targetViewSizeProvider;
        this.A09 = r6;
        this.A04 = r10.A05;
        this.A07 = r10.A0S;
    }
}
