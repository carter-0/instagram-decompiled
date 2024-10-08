package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.AZz  reason: case insensitive filesystem */
public final class C40310AZz implements AnonymousClass874, C3508686r, AnonymousClass875 {
    public final int A00;
    public final Object A01;

    public C40310AZz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DBi(AnonymousClass87G r7, String str, int i, boolean z) {
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        PickerConfiguration.ItemConfiguration itemConfiguration;
        VM3 vm3;
        String str2;
        String str3;
        String str4;
        0sK r3;
        if (this.A00 != 0) {
            C380589Yt r4 = (C380589Yt) this.A01;
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            if (((AnonymousClass876) r4.A07.getValue()).A07(i)) {
                if (r7 != null) {
                    str4 = r7.A0G;
                } else {
                    str4 = null;
                }
                r4.A01 = str4;
                27r A012 = 27p.A01(r4.A05);
                if (A012.A0J() != null) {
                    27r.A09(C59725JVj.POST_CAPTURE, A012, "TIMELINE_TRANSITION_CHOOSE_SWIPE", A012.A04.A0W);
                }
                ((ReboundViewPager) r4.A0A.getValue()).A0L(i, 0.0f);
                if (r7 != null && (r3 = r4.A02) != null) {
                    r3.invoke(r7.A0G, r7.getId(), AnonymousClass7TE.A0u());
                    return;
                }
                return;
            }
            return;
        }
        AS8 as8 = (AS8) this.A01;
        as8.A09.EKh(i, true);
        B12 b12 = as8.A01;
        if (b12 != null) {
            b12.onPickerItemSelected(i);
        }
        PickerConfiguration pickerConfiguration = as8.A00;
        if (pickerConfiguration != null && (itemConfigurationArr = pickerConfiguration.mItems) != null && (itemConfiguration = itemConfigurationArr[i]) != null && (vm3 = as8.A02) != null && (str2 = itemConfiguration.mId) != null) {
            UYH uyh = vm3.A00;
            uyh.A02().A02(C16612Uy8.VARIANT_CHANGED, "", (String) null);
            C297775sJ r0 = uyh.A03;
            if (r0 == null) {
                str3 = "arAdsDataStore";
            } else {
                C15032UKl A002 = r0.A00(str2);
                if (A002 != null) {
                    C17825Vge vge = uyh.A07;
                    if (vge == null) {
                        str3 = "productCardViewController";
                    } else {
                        vge.A00(A002, uyh.A03().A02, uyh.A03().A01);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DMG(AnonymousClass87G r5, int i) {
        if (this.A00 != 0) {
            0qQ.A0B(r5, 0);
            C380589Yt r2 = (C380589Yt) this.A01;
            r2.A01 = r5.A0G;
            ReboundViewPager.A06((ReboundViewPager) r2.A0A.getValue(), true, false);
            0sK r3 = r2.A02;
            if (r3 != null) {
                r3.invoke(r2.A01, (Object) null, true);
            }
        }
    }

    public final void D8f(int i) {
    }

    public final void DBk(AnonymousClass87G r1, int i, boolean z) {
    }
}
