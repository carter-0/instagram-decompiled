package com.instagram.creation.ml;

import X.05G;
import X.0fO;
import X.0qQ;
import X.106;
import X.AnonymousClass7TE;
import X.AnonymousClass8CO;
import X.AnonymousClass8Eg;
import X.AnonymousClass9ZD;
import X.AnonymousClass9ZE;
import X.C21289XSu;
import X.C3501083h;
import X.C3501183i;
import X.C352658Eh;
import X.C391749ta;
import X.C61043Jvh;
import X.MP4;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

public final class VisualFeatureStore {
    public static VisualFeatureStore A04;
    public C3501183i A00 = A01(this);
    public final HashMap A01 = AnonymousClass7TE.A1E();
    public final Context A02;
    public final UserSession A03;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.Long r12, java.lang.String r13, X.AnonymousClass4D7 r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r7 = r13
            r4 = 0
            boolean r0 = X.C66145MDx.A02(r4, r14)
            r6 = r11
            if (r0 == 0) goto L_0x002b
            r3 = r14
            X.MDx r3 = (X.C66145MDx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r3.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 2
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L_0x003c
            if (r0 == r5) goto L_0x0031
            if (r0 == r2) goto L_0x0031
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002b:
            X.MDx r3 = new X.MDx
            r3.<init>(r11, r14, r4)
            goto L_0x0017
        L_0x0031:
            java.lang.Object r7 = r3.A02
            java.lang.Object r0 = r3.A01
            com.instagram.creation.ml.VisualFeatureStore r0 = (com.instagram.creation.ml.VisualFeatureStore) r0
            X.0eS.A00(r1)
            goto L_0x00c7
        L_0x003c:
            X.0eS.A00(r1)
            java.util.HashMap r1 = r11.A01
            java.lang.Object r0 = r1.get(r13)
            X.05G r0 = (X.05G) r0
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x00c1
        L_0x004f:
            if (r16 != 0) goto L_0x00c1
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x00d5
            if (r15 == 0) goto L_0x008e
            r3.A01 = r11
            r3.A02 = r13
            r3.A00 = r5
            java.lang.Object r0 = r1.get(r13)
            X.05G r0 = (X.05G) r0
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0076
        L_0x0071:
            X.0gF r0 = X.C60340gF.A00
        L_0x0073:
            if (r0 != r4) goto L_0x00c6
            return r4
        L_0x0076:
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 1632833315(0x61530f23, float:2.433346E20)
            r0 = 3
            X.0nV r2 = r2.AOJ(r1, r0)
            r1 = 18
            X.MGy r0 = new X.MGy
            r0.<init>(r11, r13, r8, r1)
            java.lang.Object r0 = X.1Eo.A00(r3, r2, r0)
            if (r0 != r4) goto L_0x0071
            goto L_0x0073
        L_0x008e:
            if (r12 == 0) goto L_0x00c6
            long r9 = r12.longValue()
            r3.A01 = r11
            r3.A02 = r13
            r3.A00 = r2
            java.lang.Object r0 = r1.get(r13)
            X.05G r0 = (X.05G) r0
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x00ab
        L_0x00a8:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0073
        L_0x00ab:
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 1632833315(0x61530f23, float:2.433346E20)
            r0 = 3
            X.0nV r0 = r2.AOJ(r1, r0)
            com.instagram.creation.ml.VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2 r5 = new com.instagram.creation.ml.VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2
            r5.<init>(r6, r7, r8, r9)
            java.lang.Object r0 = X.1Eo.A00(r3, r0, r5)
            if (r0 != r4) goto L_0x00a8
            goto L_0x0073
        L_0x00c1:
            java.lang.Object r0 = r1.get(r13)
            goto L_0x00cd
        L_0x00c6:
            r0 = r11
        L_0x00c7:
            java.util.HashMap r0 = r0.A01
            java.lang.Object r0 = r0.get(r7)
        L_0x00cd:
            X.05G r0 = (X.05G) r0
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r8 = r0.getValue()
        L_0x00d5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.ml.VisualFeatureStore.A03(java.lang.Long, java.lang.String, X.4D7, boolean, boolean):java.lang.Object");
    }

    public static final C3501183i A01(VisualFeatureStore visualFeatureStore) {
        C3501183i r2 = visualFeatureStore.A00;
        if (r2 == null) {
            C3501083h r0 = IgVoltronModelLoader.Companion;
            UserSession userSession = visualFeatureStore.A03;
            IgVoltronModelLoader A002 = r0.A00(userSession);
            if (A002.arePytorchLibrariesLoaded.get()) {
                r2 = new C3501183i(new AnonymousClass8CO(userSession, AnonymousClass7TE.A1I(C352658Eh.A00(AnonymousClass8Eg.SCENE_UNDERSTANDING))), false);
            } else {
                A002.fetchPytorchVoltronModule(new MP4(visualFeatureStore, 37));
                r2 = null;
            }
            visualFeatureStore.A00 = r2;
        }
        return r2;
    }

    public static final void A02(C391749ta r5, VisualFeatureStore visualFeatureStore, String str) {
        Float f;
        String str2;
        if (r5 instanceof AnonymousClass9ZE) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C21289XSu xSu : ((AnonymousClass9ZE) r5).A00) {
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
                    A1C.add(new C61043Jvh(str3, str2, floatValue));
                }
            }
            HashMap hashMap = visualFeatureStore.A01;
            Object obj = hashMap.get(str);
            if (obj == null) {
                obj = 106.A01((Object) null);
                hashMap.put(str, obj);
            }
            05G r12 = (05G) obj;
            do {
            } while (!r12.AIY(r12.getValue(), A1C));
        }
    }

    public VisualFeatureStore(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
    }

    public static final Bitmap A00(Bitmap bitmap, float f) {
        Matrix A0U = AnonymousClass7TE.A0U();
        A0U.postRotate(f);
        Bitmap bitmap2 = bitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        0fO.A03(bitmap2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, A0U, true);
        0qQ.A07(createBitmap);
        return createBitmap;
    }
}
