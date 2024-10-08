package com.instagram.react.modules.product;

import X.1Ng;
import X.1wn;
import X.28t;
import X.AnonymousClass1Nd;
import X.AnonymousClass36R;
import X.AnonymousClass36U;
import X.AnonymousClass36V;
import X.AnonymousClass7TE;
import X.C358248ab;
import X.C50348FZf;
import X.C64649Lfb;
import X.DbT;
import X.DbU;
import X.JZM;
import X.Pxe;
import X.QZK;
import X.SV1;
import X.T72;
import android.app.Activity;
import android.content.Context;
import com.facebook.fbreact.specs.NativeIGMediaPickerReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

@ReactModule(name = "IGMediaPickerNativeModule")
public class IgReactMediaPickerNativeModule extends NativeIGMediaPickerReactModuleSpec {
    public static final String HEIGHT = "height";
    public static final String IG_MEDIA_PICKER_PHOTO_SELECTED = "IGMediaPickerPhotoSelected";
    public static final String MODULE_NAME = "IGMediaPickerNativeModule";
    public static final String URI = "uri";
    public static final String WIDTH = "width";
    public AnonymousClass36V mCaptureFlowHelper;
    public 1Ng mIgEventBus;
    public final 1wn mImageSelectedEventListener = new T72(this, 6);
    public CharSequence[] mOptions;

    public String getName() {
        return "IGMediaPickerNativeModule";
    }

    /* access modifiers changed from: private */
    public boolean matches(Context context, int i, int i2) {
        return this.mOptions[i].equals(context.getString(i2));
    }

    private void removeListener() {
        this.mIgEventBus.A02(this.mImageSelectedEventListener, C64649Lfb.class);
    }

    private void stopCaptureFlow() {
        JZM.A00(((AnonymousClass36U) this.mCaptureFlowHelper).A04).A09((28t) null, 6);
    }

    public IgReactMediaPickerNativeModule(QZK qzk, UserSession userSession) {
        super(qzk);
        this.mIgEventBus = AnonymousClass1Nd.A00(userSession);
        this.mCaptureFlowHelper = AnonymousClass36R.A00(qzk, userSession, new C50348FZf(this, 8));
    }

    private CharSequence[] getOptions(Context context, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (z) {
            DbU.A19(context, A1C, 2131971317);
        }
        DbU.A19(context, A1C, 2131971318);
        DbU.A19(context, A1C, 2131971316);
        CharSequence[] charSequenceArr = new CharSequence[A1C.size()];
        this.mOptions = charSequenceArr;
        A1C.toArray(charSequenceArr);
        return this.mOptions;
    }

    /* access modifiers changed from: private */
    public void onEventCleanup() {
        removeListener();
        stopCaptureFlow();
    }

    public void openNativePhotoPicker(double d, boolean z) {
        Activity A00 = Pxe.A0T(this).A00();
        A00.getClass();
        A00.getIntent().getClass();
        DbU.A06(A00).getClass();
        SV1 sv1 = new SV1(4, A00, this);
        C358248ab r1 = new C358248ab(A00);
        r1.A0e(sv1, getOptions(A00, z));
        r1.A04();
        DbT.A1V(r1);
    }
}
