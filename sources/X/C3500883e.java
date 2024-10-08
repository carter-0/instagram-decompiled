package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.83e  reason: invalid class name and case insensitive filesystem */
public final class C3500883e {
    public C3501183i A00;
    public final UserSession A01;
    public final AnonymousClass836 A02;
    public final C3500983f A03;
    public final HashMap A04 = new HashMap();
    public final AnonymousClass0eM A05;

    public final List A05(String str, int i) {
        String str2 = str;
        0qQ.A0B(str, 0);
        long A002 = this.A03.A00();
        if (i > 0) {
            A03(this, str2, (long) i, A002);
        } else {
            A02(this, str, A002);
        }
        return (List) this.A04.get(str);
    }

    public /* synthetic */ C3500883e(AnonymousClass12V r5, UserSession userSession, AnonymousClass836 r7, C262224Cq r8) {
        C3500983f r0 = new C3500983f(userSession);
        this.A01 = userSession;
        this.A02 = r7;
        this.A03 = r0;
        this.A05 = AnonymousClass0eN.A01(new AnonymousClass9LJ(r5, 39));
        UserSession userSession2 = this.A01;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession2, 36319355851709609L) || 182.A06(r2, userSession2, 36319355851644072L)) {
            C3500983f r3 = this.A03;
            long A002 = r3.A00();
            A01(this, A002);
            if (this.A00 != null) {
                r3.A01(A002);
            } else {
                r3.A02(A002, "processor_not_ready");
            }
        }
        AnonymousClass11O.A03(r8, 11M.A01((0nV) this.A05.getValue(), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 40), r7.A03)));
    }

    private final void A00(C391749ta r7, String str, long j) {
        Float f;
        String str2;
        if (r7 instanceof AnonymousClass9ZE) {
            ArrayList arrayList = new ArrayList();
            for (C21289XSu xSu : ((AnonymousClass9ZE) r7).A00) {
                0qQ.A0C(xSu, "null cannot be cast to non-null type com.aiplatform.processors.scenerecognizer.model.SceneRecognizerOutputModel");
                AnonymousClass9ZD r1 = (AnonymousClass9ZD) xSu;
                String str3 = r1.A01;
                if (!(str3 == null || (f = r1.A00) == null)) {
                    float floatValue = f.floatValue();
                    int ordinal = r1.A03.ordinal();
                    if (ordinal == 0) {
                        str2 = "xray";
                    } else if (ordinal != 1) {
                        str2 = "";
                    } else {
                        str2 = "vizardx";
                    }
                    arrayList.add(new C381469bo(str3, str2, floatValue));
                }
            }
            this.A04.put(str, arrayList);
            this.A03.A01(j);
            return;
        }
        this.A03.A02(j, "inference_failed");
    }

    public static final void A01(C3500883e r5, long j) {
        C3501183i r2;
        AnonymousClass8CM r3;
        boolean z;
        C3501083h r0 = IgVoltronModelLoader.Companion;
        UserSession userSession = r5.A01;
        IgVoltronModelLoader A002 = r0.A00(userSession);
        if (182.A06(0Tu.A05, userSession, 36319355851971757L)) {
            boolean z2 = A002.areExecuTorchLibrariesLoaded.get();
            r2 = null;
            C3500983f r1 = r5.A03;
            if (z2) {
                r1.A03(j, "voltron_ready_initializing_model_et");
                List singletonList = Collections.singletonList(VersionedCapability.SceneUnderstanding);
                0qQ.A07(singletonList);
                List singletonList2 = Collections.singletonList(C352658Eh.A00(AnonymousClass8Eg.SCENEX_EXECUTORCH));
                0qQ.A07(singletonList2);
                r3 = new AnonymousClass8CM((AnonymousClass84S) null, userSession, singletonList, singletonList2);
                z = true;
            } else {
                r1.A03(j, "voltron_not_ready_fetching_et");
                A002.fetchExecuTorchVoltronModule(new MP5(r5, 42));
                r5.A00 = r2;
            }
        } else {
            boolean z3 = A002.arePytorchLibrariesLoaded.get();
            r2 = null;
            C3500983f r12 = r5.A03;
            if (z3) {
                r12.A03(j, "voltron_ready_initializing_model");
                List singletonList3 = Collections.singletonList(VersionedCapability.SceneUnderstanding);
                0qQ.A07(singletonList3);
                List singletonList4 = Collections.singletonList(C352658Eh.A00(AnonymousClass8Eg.SCENE_UNDERSTANDING));
                0qQ.A07(singletonList4);
                r3 = new AnonymousClass8CM((AnonymousClass84S) null, userSession, singletonList3, singletonList4);
                z = false;
            } else {
                r12.A03(j, "voltron_not_ready_fetching");
                A002.fetchPytorchVoltronModule(new C377089Km(r5, 2));
                r5.A00 = r2;
            }
        }
        r2 = new C3501183i(r3, z);
        r5.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r4 != 8) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C3500883e r14, java.lang.String r15, long r16) {
        /*
            java.util.HashMap r0 = r14.A04
            boolean r0 = r0.containsKey(r15)
            java.lang.String r10 = ""
            r12 = r16
            if (r0 == 0) goto L_0x001e
            X.83f r0 = r14.A03
            java.lang.String r9 = "photo_already_cached"
            X.29E r8 = r0.A00
            monitor-enter(r8)
            r11 = 17640443(0x10d2bfb, float:2.5929164E-38)
            r8.A06(r9, r10, r11, r12)     // Catch:{ all -> 0x001b }
            monitor-exit(r8)
            return
        L_0x001b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x001e:
            X.83i r0 = r14.A00
            if (r0 != 0) goto L_0x0025
            A01(r14, r12)
        L_0x0025:
            X.83i r2 = r14.A00
            X.83f r3 = r14.A03
            if (r2 != 0) goto L_0x0031
            java.lang.String r0 = "processor_not_ready"
        L_0x002d:
            r3.A02(r12, r0)
            return
        L_0x0031:
            java.lang.String r0 = "decoding_photo"
            r3.A03(r12, r0)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r15)
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "pre_processing_photo"
            r3.A03(r12, r0)
            android.graphics.Bitmap r4 = X.C392369uh.A00(r1)
            X.ADa r1 = X.C39879ADa.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r5 = r1.A00(r0, r4)
            android.media.ExifInterface r1 = new android.media.ExifInterface
            r1.<init>(r15)
            java.lang.String r0 = "Orientation"
            r11 = 1
            int r4 = r1.getAttributeInt(r0, r11)
            r0 = 3
            if (r4 == r0) goto L_0x0079
            r0 = 6
            r1 = 1119092736(0x42b40000, float:90.0)
            if (r4 == r0) goto L_0x007b
            r0 = 7
            r1 = 1132920832(0x43870000, float:270.0)
            if (r4 == r0) goto L_0x007b
            r0 = 8
            if (r4 == r0) goto L_0x007b
        L_0x006a:
            java.lang.String r0 = "processing_photo"
            r3.A03(r12, r0)
            X.AyZ r0 = X.C41682AyZ.A00
            X.9ta r0 = r2.A02(r5, r0)
            r14.A00(r0, r15, r12)
            return
        L_0x0079:
            r1 = 1127481344(0x43340000, float:180.0)
        L_0x007b:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.postRotate(r1)
            int r8 = r5.getWidth()
            int r9 = r5.getHeight()
            r6 = 0
            X.0fO.A03(r5)
            r7 = r6
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            X.0qQ.A07(r5)
            goto L_0x006a
        L_0x0098:
            java.lang.String r0 = "bitmap_not_ready"
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3500883e.A02(X.83e, java.lang.String, long):void");
    }

    public static final void A03(C3500883e r7, String str, long j, long j2) {
        long j3 = j2;
        if (r7.A04.containsKey(str)) {
            29E r1 = r7.A03.A00;
            synchronized (r1) {
                r1.A06("video_already_cached", "", 17640443, j3);
            }
            return;
        }
        if (r7.A00 == null) {
            A01(r7, j2);
        }
        C3501183i r4 = r7.A00;
        C3500983f r12 = r7.A03;
        if (r4 == null) {
            r12.A02(j2, "processor_not_ready");
            return;
        }
        r12.A03(j2, "processing_center_frame");
        List A1P = 0sr.A1P(new C21288XSt[]{new AnonymousClass9ZA(str), new AnonymousClass9Z9(j)});
        List singletonList = Collections.singletonList("CONCEPT_SCORES");
        0qQ.A07(singletonList);
        r7.A00(r4.A03(new A9Y(singletonList), A1P, new C377299Lh(j2, r7, 0)), str, j2);
    }

    public final List A04() {
        String str;
        ArrayList A052 = ((AnonymousClass831) this.A02.A03.getValue()).A05();
        if (!(!A052.isEmpty())) {
            return null;
        }
        HashMap hashMap = this.A04;
        ClipSegment A032 = AnonymousClass51Q.A03((AnonymousClass51N) A052.get(0));
        if (A032 instanceof ClipSegment.PhotoSegment) {
            str = ((ClipSegment.PhotoSegment) A032).A05;
        } else {
            str = ((ClipSegment.VideoSegment) A032).A0E;
        }
        List list = (List) hashMap.get(str);
        if (list != null) {
            return list;
        }
        return null;
    }
}
