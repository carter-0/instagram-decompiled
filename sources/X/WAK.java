package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;

public final class WAK implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EffectAttribution A01;
    public final /* synthetic */ C19199WPf A02;
    public final /* synthetic */ EffectInfoBottomSheetMode A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public WAK(Context context, EffectAttribution effectAttribution, C19199WPf wPf, EffectInfoBottomSheetMode effectInfoBottomSheetMode, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = wPf;
        this.A07 = str;
        this.A00 = context;
        this.A04 = str2;
        this.A05 = str3;
        this.A08 = str4;
        this.A01 = effectAttribution;
        this.A06 = str5;
        this.A09 = str6;
        this.A03 = effectInfoBottomSheetMode;
    }

    public final void onClick(View view) {
        Activity activity;
        int A052 = AnonymousClass0fD.A05(-995585309);
        C19199WPf wPf = this.A02;
        String str = this.A07;
        Context context = this.A00;
        String str2 = this.A04;
        String str3 = this.A05;
        String str4 = this.A08;
        EffectAttribution effectAttribution = this.A01;
        String str5 = this.A06;
        String str6 = this.A09;
        EffectInfoBottomSheetMode effectInfoBottomSheetMode = this.A03;
        Object obj = null;
        boolean z = true;
        if (2PP.A00(str, AnonymousClass7TF.A0e(context.getResources(), str6, 2131953109))) {
            int ordinal = effectInfoBottomSheetMode.ordinal();
            if (ordinal == 0) {
                activity = wPf.A05;
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                activity = wPf.A05;
                FragmentActivity activity2 = wPf.A0D.getActivity();
                if (activity2 != null) {
                    activity2.setResult(60572);
                    activity2.finish();
                }
            } else {
                0kD.A01(C19199WPf.__redex_internal_original_name, "Unknown bottom sheet mode");
            }
            C19199WPf.A00(activity, wPf, str4);
        } else {
            str2.getClass();
            if (2PP.A00(str, context.getString(2131953129))) {
                Activity activity3 = wPf.A05;
                DbX.A10(activity3, AnonymousClass37D.A00);
                C49894FBx.A00(activity3, effectAttribution, wPf.A0B);
            } else if (2PP.A00(str, context.getResources().getString(2131953130))) {
                if (str4 != null && !"25025320".equals(str4)) {
                    z = false;
                }
                wPf.A06(str2, str3, z);
            } else if (2PP.A00(str, context.getResources().getString(2131953114))) {
                wPf.A04(str2);
            } else if (2PP.A00(str, context.getResources().getString(2131954275))) {
                wPf.A03();
            } else if (2PP.A00(str, 0mp.A06("%s %s", new Object[]{"AR Effect ID:", str2}))) {
                C49894FBx.A01(wPf.A05, str2);
            } else if (2PP.A00(str, context.getString(2131953131))) {
                C49894FBx.A02(wPf.A05, Integer.valueOf(wPf.A04), str2);
            } else if (2PP.A00(str, context.getResources().getString(2131954722))) {
                obj.getClass();
                throw AnonymousClass00P.createAndThrow();
            } else if (2PP.A00(str, context.getString(2131953122))) {
                wPf.A05(str2, str5, str6);
            }
        }
        AnonymousClass0fD.A0C(-417176373, A052);
    }
}
