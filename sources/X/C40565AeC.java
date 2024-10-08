package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentBackgroundModalActivity;

/* renamed from: X.AeC  reason: case insensitive filesystem */
public final class C40565AeC implements C358108aN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C40565AeC(Context context, FragmentActivity fragmentActivity, String str, String str2, boolean z) {
        this.A01 = fragmentActivity;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = context;
    }

    public final void onFailure(String str, boolean z) {
        C59689JTv.A01(this.A00, (String) null, 2131974093, 1);
    }

    public final void onSuccess() {
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        boolean z = this.A04;
        Object newInstance = Class.forName("com.instagram.dogfoodingassistant.impl.DogfoodingAssistantPluginImpl").newInstance();
        0qQ.A0C(newInstance, "null cannot be cast to non-null type com.instagram.dogfoodingassistant.intf.DogfoodingAssistantPlugin");
        C48252EbX ebX = (C48252EbX) newInstance;
        0qQ.A0B(ebX, 0);
        C48252EbX.A00 = ebX;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("bottom_sheet_content_fragment", "dogfood_assistant");
        if (str != null) {
            A0a.putString(AnonymousClass000.A00(3028), str);
        }
        if (str2 != null) {
            A0a.putString(AnonymousClass000.A00(3026), str2);
        }
        A0a.putBoolean(AnonymousClass000.A00(3027), z);
        A0a.putString("dogfooding_assistant_surface", AnonymousClass000.A00(3784));
        AnonymousClass6W8.A06(fragmentActivity, A0a, TransparentBackgroundModalActivity.class, "bottom_sheet");
    }
}
