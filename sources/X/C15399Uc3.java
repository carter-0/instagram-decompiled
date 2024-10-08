package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Uc3  reason: case insensitive filesystem */
public final class C15399Uc3 extends C273374mT {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridPassingNativeValueIntoBloksFragment";
    public FrameLayout A00;
    public C229382nI A01;
    public AnonymousClass6NS A02;
    public String A03;
    public Button A04;
    public TextView A05;
    public 2el A06;

    public final String getModuleName() {
        return "ig_bloks_native_hybrid_passing_native_value_into_bloks_example";
    }

    public static void A00(C15399Uc3 uc3) {
        String str = "A";
        if (uc3.A03.equals(str)) {
            str = "B";
        }
        uc3.A03 = str;
        uc3.A05.setText(str);
        if (uc3.A02 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("abc", uc3.A03);
            uc3.A02.A08(hashMap);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(162798144);
        C15399Uc3.super.onCreate(bundle);
        this.A03 = "A";
        this.A06 = DbY.A0U();
        this.A01 = C229382nI.A02(this, this, getSession(), this.A06);
        AnonymousClass0fD.A09(385378890, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(267554272);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.passing_native_value_into_bloks_example);
        this.A05 = AnonymousClass7TE.A0d(A0C, R.id.native_value);
        Button button = (Button) A0C.requireViewById(R.id.button);
        this.A04 = button;
        AnonymousClass0fU.A00(new FP6((Object) this, 57), button);
        this.A00 = (FrameLayout) A0C.findViewById(R.id.bloks_view);
        AnonymousClass4D6 r3 = this.A01.A07;
        C360678ey A062 = C359988do.A06(getSession(), "com.instagram.bloks_native_hybrid_shell.passing_native_value_into_bloks", (Map) null);
        A062.A00(new C15412UcO(this, 1));
        r3.schedule(A062);
        A00(this);
        AnonymousClass0fD.A09(-1608271207, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1515858052);
        super.onDestroyView();
        this.A02.A04();
        AnonymousClass0fD.A09(921932853, A022);
    }
}
