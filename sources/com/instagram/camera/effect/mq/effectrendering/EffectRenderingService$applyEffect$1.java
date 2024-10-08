package com.instagram.camera.effect.mq.effectrendering;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C3504584s;
import X.C371098xa;
import X.C60340gF;
import com.instagram.camera.effect.models.CameraAREffect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.camera.effect.mq.effectrendering.EffectRenderingService$applyEffect$1", f = "EffectRenderingService.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class EffectRenderingService$applyEffect$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ CameraAREffect A02;
    public final /* synthetic */ C3504584s A03;
    public final /* synthetic */ C371098xa A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectRenderingService$applyEffect$1(CameraAREffect cameraAREffect, C3504584s r3, C371098xa r4, String str, String str2, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A03 = r3;
        this.A02 = cameraAREffect;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.camera.effect.mq.effectrendering.EffectRenderingService$applyEffect$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        C3504584s r2 = this.A03;
        ? effectRenderingService$applyEffect$1 = new EffectRenderingService$applyEffect$1(this.A02, r2, this.A04, this.A05, this.A06, r9);
        effectRenderingService$applyEffect$1.A01 = obj;
        return effectRenderingService$applyEffect$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EffectRenderingService$applyEffect$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.camera.effect.mq.effectrendering.EffectRenderingService$applyEffect$1, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v37, types: [java.lang.Object, X.MVB] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            X.1Hj r9 = X.1Hj.A02
            r10 = r21
            int r0 = r10.A00
            r8 = 1
            if (r0 == 0) goto L_0x000f
            X.0eS.A00(r22)
        L_0x000c:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x000f:
            X.0eS.A00(r22)
            java.lang.Object r7 = r10.A01
            X.3pV r7 = (X.C252683pV) r7
            X.8xb r3 = new X.8xb
            r3.<init>(r7)
            X.84s r0 = r10.A03
            X.82X r4 = r0.A00
            com.instagram.camera.effect.models.CameraAREffect r12 = r10.A02
            java.lang.String r2 = r10.A05
            java.lang.String r1 = r10.A06
            X.8xa r5 = r10.A04
            r14 = 0
            X.0qQ.A0B(r12, r14)
            java.lang.String r6 = r12.A0K
            X.0qQ.A07(r6)
            X.6dz r11 = r4.A06
            if (r11 == 0) goto L_0x017e
            X.6e0 r0 = r11.B0C()
            if (r0 == 0) goto L_0x017e
            boolean r0 = X.C312206e0.A00(r12, r0)
            if (r0 != 0) goto L_0x005b
            boolean r0 = r11.CKk(r12)
            if (r0 == r8) goto L_0x005b
            X.81r r1 = r4.A03
            java.lang.String r0 = "low_disk_space"
            r1.AVe(r6, r0)
        L_0x004d:
            r3.A00()
        L_0x0050:
            X.8xm r0 = X.C371198xm.A00
            r10.A00 = r8
            java.lang.Object r0 = X.C239083Et.A00(r10, r0, r7)
            if (r0 != r9) goto L_0x000c
            return r9
        L_0x005b:
            com.instagram.camera.effect.mq.IgCameraEffectsController r11 = r4.A05
            X.8xg r20 = new X.8xg
            r0 = r20
            r0.<init>(r5)
            X.8xh r13 = new X.8xh
            r13.<init>(r3, r4)
            X.81b r0 = r11.A0K
            X.7lC r4 = r0.A04
            java.lang.String r15 = "IgCameraEffectsController"
            if (r4 == 0) goto L_0x00cc
            java.lang.String r3 = r12.A0K
            java.lang.String r0 = r12.A0M
            boolean r0 = r4.CL7(r3, r0)
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "OneCamera detected there is not enough resources to select effect"
            X.0KC.A0C(r15, r0)
            java.lang.String r2 = r12.A0K
            X.0qQ.A0B(r2, r14)
            X.82X r3 = r13.A01
            X.81r r1 = r3.A03
            java.lang.String r0 = "not enough memory"
            r1.AVe(r2, r0)
            X.6ap r2 = new X.6ap
            r2.<init>()
            r2.A05()
            java.lang.String r0 = "ar_effects_not_enough_memory"
            r2.A0H = r0
            android.content.Context r1 = r3.A02
            r0 = 2131953135(0x7f1305ef, float:1.9542732E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0D = r0
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r2.A0G = r0
            r2.A0L = r8
            X.Lrw r0 = new X.Lrw
            r0.<init>()
            r2.A0A(r0)
            X.Dc2 r2 = r2.A00()
            X.1xC r1 = X.1xC.A01
            X.3GP r0 = new X.3GP
            r0.<init>(r2)
            r1.A00(r0)
            X.8xb r3 = r13.A00
            goto L_0x004d
        L_0x00cc:
            java.lang.String r6 = r12.A0K
            com.instagram.camera.effect.models.CameraAREffect r3 = r11.A09
            r11.A09 = r12
            X.6dz r5 = r11.A0L
            if (r5 == 0) goto L_0x00f6
            boolean r0 = r6.isEmpty()     // Catch:{ NumberFormatException -> 0x00e9 }
            if (r0 != 0) goto L_0x00e9
            long r18 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00e9 }
            r16 = 0
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            r5.CjU(r6)
        L_0x00e9:
            if (r3 == 0) goto L_0x00f6
            boolean r0 = X.2PP.A00(r3, r12)
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = r3.A0K
            r5.EyC(r0)
        L_0x00f6:
            java.util.Set r0 = r11.A0R
            java.util.Iterator r4 = r0.iterator()
        L_0x00fc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = r4.next()
            X.82E r0 = (X.AnonymousClass82E) r0
            r0.DBe(r12, r3)
            goto L_0x00fc
        L_0x010c:
            r11.A0A = r2
            X.82P r0 = r11.A0H
            java.util.Map r4 = r0.A00
            r4.clear()
            if (r1 == 0) goto L_0x013f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x013f
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0144 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0144 }
            java.util.Iterator r16 = r2.keys()     // Catch:{ JSONException -> 0x0144 }
        L_0x012b:
            boolean r0 = r16.hasNext()     // Catch:{ JSONException -> 0x0144 }
            if (r0 == 0) goto L_0x014c
            java.lang.Object r1 = r16.next()     // Catch:{ JSONException -> 0x0144 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0144 }
            java.lang.String r0 = r2.getString(r1)     // Catch:{ JSONException -> 0x0144 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0144 }
            goto L_0x012b
        L_0x013f:
            X.0sm r3 = X.0Yt.A0E()
            goto L_0x014c
        L_0x0144:
            r2 = move-exception
            java.lang.String r1 = "ig_ar_persistence"
            java.lang.String r0 = "Couldn't parse effect shared scope data"
            X.0wb.A06(r1, r0, r2)
        L_0x014c:
            r4.putAll(r3)
            if (r5 != 0) goto L_0x0169
            java.lang.String r0 = "setArEffect() mDelegate should not be null"
            X.0KC.A0C(r15, r0)
            X.0qQ.A0B(r6, r14)
            X.82X r0 = r13.A01
            X.81r r1 = r0.A03
            java.lang.String r0 = "effect_manager_is_null"
            r1.AVe(r6, r0)
            X.8xb r0 = r13.A00
            r0.A00()
            goto L_0x0050
        L_0x0169:
            X.0nO r1 = r11.A0O
            X.8xl r0 = new X.8xl
            r16 = r20
            r17 = r13
            r18 = r6
            r13 = r0
            r14 = r12
            r15 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            r1.ATE(r0)
            goto L_0x0050
        L_0x017e:
            X.81r r1 = r4.A03
            java.lang.String r0 = "effect_render_helper_not_ready"
            r1.AVe(r6, r0)
            java.lang.String r2 = "CameraEffectFacade"
            java.lang.String r1 = "EffectRenderHelper is null"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectrendering.EffectRenderingService$applyEffect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
