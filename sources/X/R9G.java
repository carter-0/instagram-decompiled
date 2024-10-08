package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bloks.components.bkcomponentsfoaavatareditorautogencameraview.BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1;
import com.facebook.avatar.autogen.download.IgModelDownloader;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class R9G extends C14097Tpp {
    public C11254SHo A00;
    public final L36 A01;
    public final BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1 A02 = new BloksComponentFoaAvatarAutogenCameraViewRenderUnit$lifeCycleListener$1(this);
    public final T72 A03 = new T72(this, 0);
    public final 1Ng A04;
    public final boolean A05;
    public final UserSession A06;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new FrameLayout(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r12, C276544tV r13, Object obj) {
        C60340gF r0;
        Application application;
        FrameLayout frameLayout = (FrameLayout) view;
        boolean A1U = AnonymousClass7TF.A1U(0, frameLayout, r12);
        File A0s = JTO.A0s(AnonymousClass1F2.A00().AXT((1LJ) null, 456305453), String.valueOf(System.currentTimeMillis()));
        Pxg.A1L(A0s);
        AESelfieCaptureConfig aESelfieCaptureConfig = new AESelfieCaptureConfig(new IgModelDownloader(C308206Td.A0A(r12)), Boolean.valueOf(this.A05), JTO.A0s(A0s, "TEMP_SELFIE.jpg").getCanonicalPath());
        Context context = r12.A00;
        C11254SHo sHo = new C11254SHo(context, this.A01, C11120SAz.A00, aESelfieCaptureConfig);
        this.A00 = sHo;
        sHo.A00 = frameLayout;
        C40161AUb aUb = sHo.A03;
        if (aUb == null) {
            aUb = C392479us.A00(sHo.A05, new Slr(sHo), (Integer) null, false);
            C40161AUb.A00(aUb).EqJ(921600);
            C40161AUb.A00(aUb).Efh(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
            C40161AUb.A00(aUb).Ega(921600);
            C40161AUb.A00(aUb).Efj(false);
            C40161AUb.A00(aUb).Eew(A1U);
            sHo.A03 = aUb;
        }
        0qQ.A0C(aUb, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.LiteCameraController");
        try {
            aUb.A03(A1U ? 1 : 0);
            r0 = C60340gF.A00;
        } catch (Throwable th) {
            r0 = JTO.A1B(th);
        }
        Throwable A002 = 0eR.A00(r0);
        if (A002 != null) {
            0KC.A0F("AESelfieViewProvider", "Unable to set initial camera facing", A002);
        }
        Context context2 = sHo.A05;
        View A012 = aUb.A01();
        FrameLayout frameLayout2 = sHo.A00;
        if (frameLayout2 != null) {
            frameLayout2.addView(A012);
        }
        C12060Sln sln = new C12060Sln(context2, sHo.A07, sHo, AnonymousClass12W.A00);
        sHo.A01 = sln;
        sHo.A02 = sln.A03;
        aUb.EIx();
        Pxi.A1J(C11254SHo.A00(context2, sHo), 19E.A02(AnonymousClass12y.A00), 20);
        Context applicationContext = context.getApplicationContext();
        if ((applicationContext instanceof Application) && (application = (Application) applicationContext) != null) {
            application.registerActivityLifecycleCallbacks(this.A02);
        }
        this.A04.A01(this.A03, C12789T6z.class);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r7, C276544tV r8, Object obj, Object obj2) {
        Application application;
        ViewGroup viewGroup = (ViewGroup) view;
        AnonymousClass7TG.A1N(viewGroup, r7);
        C11254SHo sHo = this.A00;
        if (sHo == null) {
            0qQ.A0F("selfieViewProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        C40161AUb aUb = sHo.A03;
        if (aUb != null) {
            aUb.destroy();
        }
        Activity A002 = C11254SHo.A00(sHo.A05, sHo);
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        Pxi.A1J(A002, 19E.A02(AnonymousClass12y.A00), 19);
        sHo.A03 = null;
        sHo.A01 = null;
        viewGroup.removeAllViews();
        Context applicationContext = r7.A00.getApplicationContext();
        if ((applicationContext instanceof Application) && (application = (Application) applicationContext) != null) {
            application.unregisterActivityLifecycleCallbacks(this.A02);
        }
        this.A04.A02(this.A03, C12789T6z.class);
    }

    public R9G(L36 l36, C307786Rm r4, C276544tV r5) {
        super(r4, r5);
        this.A01 = l36;
        UserSession A002 = 0Gl.A00(C308206Td.A0A(r4));
        this.A06 = A002;
        this.A04 = AnonymousClass1Nd.A00(A002);
        this.A05 = r5.A0R(42, false);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
