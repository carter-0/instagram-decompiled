package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import java.util.List;

/* renamed from: X.8Hb  reason: invalid class name and case insensitive filesystem */
public final class C353298Hb extends C353308Hc implements C353318Hd, C312366eJ, C3493580b {
    public C352888Fl A00;
    public final C357638Yz A01;
    public final AnonymousClass82E A02 = new C353328He(this);
    public final AnonymousClass82W A03;
    public final C353338Hf A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C353298Hb(Context context, AnonymousClass82W r3, AnonymousClass0iw r4, UserSession userSession, C357638Yz r6, AnonymousClass8AL r7, AnonymousClass80U r8) {
        super(r7);
        0qQ.A0B(context, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r7, 5);
        0qQ.A0B(r3, 6);
        0qQ.A0B(userSession, 7);
        this.A01 = r6;
        this.A03 = r3;
        r8.A7w(this);
        C353338Hf r0 = new C353338Hf(context, r4, userSession, this);
        this.A04 = r0;
        this.A00 = r0;
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public final void DX9(PickerConfiguration pickerConfiguration, String str) {
        PickerConfiguration pickerConfiguration2;
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        PickerConfiguration.ItemConfiguration itemConfiguration;
        0qQ.A0B(pickerConfiguration, 1);
        C353338Hf r4 = this.A04;
        r4.A00 = pickerConfiguration;
        r4.notifyDataSetChanged();
        int i = pickerConfiguration.mSelectedIndex;
        C352888Fl r2 = this.A00;
        if (!(r2 == null || (pickerConfiguration2 = r4.A00) == null || !r4.A06(i) || (itemConfigurationArr = pickerConfiguration2.mItems) == null || (itemConfiguration = itemConfigurationArr[i]) == null)) {
            r2.A0T(itemConfiguration);
        }
        r4.A08(i, false);
        AnonymousClass8AL r1 = this.A01;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = r1.A0P;
        0qQ.A07(nestableSnapPickerRecyclerView);
        if (!nestableSnapPickerRecyclerView.isLaidOut()) {
            nestableSnapPickerRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new APE(nestableSnapPickerRecyclerView, this, i));
        } else {
            r1.A08(i);
        }
    }

    public final void DXC(B12 b12, String str) {
        0qQ.A0B(b12, 1);
        C353358Hh r0 = this.A00;
        C353338Hf r1 = this.A04;
        if (0qQ.A0K(r0, r1)) {
            r1.A01 = b12;
            Etn(true, true);
        }
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        0qQ.A0B(obj3, 2);
        if (obj == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY && obj2 != AnonymousClass80V.POSES_CAPTURE && !(obj3 instanceof AnonymousClass8SX)) {
            CL9(true);
        }
    }

    public final void FIy() {
        this.A00 = null;
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public final C312366eJ CAx() {
        return this;
    }

    public final void DCN() {
        this.A03.A00().A08(this.A02);
    }

    public final void DDR() {
        AnonymousClass82X A002 = this.A03.A00();
        AnonymousClass82E r1 = this.A02;
        0qQ.A0B(r1, 0);
        A002.A05.A0R.remove(r1);
        CL9(true);
    }

    public final void DXA() {
        this.A04.A01 = null;
        CL9(true);
    }

    public final void DXB(String str, int i) {
        C353338Hf r2 = this.A04;
        r2.A08(i, false);
        r2.A05.ACy(r2.A00);
    }

    public final void A02(List list) {
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        PickerConfiguration.ItemConfiguration itemConfiguration;
        super.A02(list);
        if (this.A00 != null) {
            C353338Hf r4 = this.A04;
            B12 b12 = r4.A01;
            if (b12 != null && r4.A02) {
                b12.onPickerItemSelected(r4.A00);
            }
            C352888Fl r3 = this.A00;
            if (r3 != null) {
                int i = r4.A00;
                PickerConfiguration pickerConfiguration = r4.A00;
                if (pickerConfiguration != null && r4.A06(i) && (itemConfigurationArr = pickerConfiguration.mItems) != null && (itemConfiguration = itemConfigurationArr[i]) != null) {
                    r3.A0T(itemConfiguration);
                }
            }
        }
    }

    public final void EcG(C352888Fl r1) {
        this.A00 = r1;
    }
}
