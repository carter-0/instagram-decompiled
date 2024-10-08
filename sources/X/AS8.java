package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.List;

public final class AS8 implements C312366eJ {
    public PickerConfiguration A00;
    public B12 A01;
    public VM3 A02;
    public ShutterButton A03;
    public boolean A04;
    public final View A05;
    public final C40680Agu A06 = new C40680Agu(this);
    public final C17825Vge A07;
    public final A8U A08;
    public final Aa7 A09;
    public final AnonymousClass876 A0A;
    public final AnonymousClass871 A0B;
    public final AnonymousClass8GY A0C = C40681Agv.A00;
    public final List A0D;
    public final Context A0E;

    public AS8(Context context, View view, C17825Vge vge, A8U a8u, AnonymousClass0iw r9, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider) {
        0qQ.A0B(userSession, 1);
        AnonymousClass7TG.A1R(view, a8u);
        this.A0E = context;
        this.A05 = view;
        this.A08 = a8u;
        this.A07 = vge;
        this.A09 = new Aa7(view, userSession, targetViewSizeProvider);
        ShutterButton shutterButton = (ShutterButton) this.A05.requireViewById(R.id.camera_shutter_button);
        this.A03 = shutterButton;
        if (shutterButton == null) {
            0qQ.A0F("shutterButton");
            throw AnonymousClass00P.createAndThrow();
        }
        shutterButton.setOnSingleTapCaptureListener(new C40682Agw(this, 0));
        shutterButton.setOnRecordVideoListener(this.A06);
        shutterButton.A0D = this.A0C;
        shutterButton.A08 = 15000;
        shutterButton.setShutterButtonRecordingStyle(shutterButton.A0j);
        shutterButton.setVisibility(8);
        this.A0A = new AnonymousClass876(context, r9, userSession, new C40310AZz(this, 0));
        this.A0B = new Aa6();
        this.A0D = AnonymousClass7TE.A1C();
    }

    public final void DX9(PickerConfiguration pickerConfiguration, String str) {
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        List list = this.A0D;
        list.clear();
        PickerConfiguration pickerConfiguration2 = pickerConfiguration;
        if (!(pickerConfiguration == null || (itemConfigurationArr = pickerConfiguration2.mItems) == null)) {
            for (PickerConfiguration.ItemConfiguration itemConfiguration : itemConfigurationArr) {
                0qQ.A0A(itemConfiguration);
                0qQ.A0B(itemConfiguration, 0);
                list.add(new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, (CameraAREffect) null, AnonymousClass87I.TYPE, new SimpleImageUrl(itemConfiguration.mImageUri), (ProductItemWithAR) null, (AnonymousClass8YF) null, "", (String) null)));
            }
        }
        this.A00 = pickerConfiguration2;
        if (!list.isEmpty()) {
            AnonymousClass876 r3 = this.A0A;
            if (r3.isEmpty()) {
                this.A09.EXs(false);
                r3.A06(list);
            }
            0fE.A00(r3, -944874659);
            Aa7 aa7 = this.A09;
            aa7.AIy(r3, this.A0B);
            aa7.EXs(true);
            this.A04 = false;
        }
    }

    public final void DXA() {
        Aa7 aa7 = this.A09;
        if (AnonymousClass7TF.A1V(aa7.A07)) {
            aa7.E4E();
            aa7.FL7(0.0f);
        }
        ShutterButton shutterButton = this.A03;
        if (shutterButton == null) {
            0qQ.A0F("shutterButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            shutterButton.setVisibility(8);
        }
    }

    public final void DXB(String str, int i) {
        this.A0A.A03(i);
    }

    public final void DXC(B12 b12, String str) {
        Aa7 aa7 = this.A09;
        aa7.E4F();
        aa7.FL7(1.0f);
        AnonymousClass876 r0 = aa7.A08;
        if (r0 != null) {
            r0.A01();
        }
        if (!this.A04) {
            PickerConfiguration pickerConfiguration = this.A00;
            if (pickerConfiguration != null) {
                this.A0A.A03(pickerConfiguration.mSelectedIndex);
            }
            this.A04 = true;
        }
        this.A01 = b12;
        ShutterButton shutterButton = this.A03;
        if (shutterButton == null) {
            0qQ.A0F("shutterButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            shutterButton.setVisibility(0);
        }
    }
}
