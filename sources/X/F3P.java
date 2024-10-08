package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class F3P {
    public static F3P A04;
    public List A00 = AnonymousClass7TE.A1C();
    public List A01 = AnonymousClass7TE.A1C();
    public List A02 = AnonymousClass7TE.A1C();
    public List A03 = AnonymousClass7TE.A1C();
    public List mFacebookAutoCompleteAccountList = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r6v0, types: [X.EHZ, X.11X] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.1xE, java.lang.Object, X.FVf] */
    public final void A00(Context context, AnonymousClass0iw r14, 0lg r15, AnonymousClass4D6 r16, C51961G9h g9h) {
        List list = this.A01;
        list.clear();
        0lg r9 = r15;
        C319606qt.A01(r15).A0C(r15);
        Iterator A0n = DbY.A0n(r15);
        while (A0n.hasNext()) {
            list.add(new ENN((C319646qx) A0n.next()));
        }
        C51961G9h g9h2 = g9h;
        A01(r15, g9h2);
        AnonymousClass4D6 r10 = r16;
        r10.schedule(new EHZ(context, r14, r9, r10, g9h2, this));
        FV8 A002 = FV8.A00();
        if (A002.A04(r15, "ig_android_growth_fx_access_fb_ig_autocomplete", "AutoCompleteAccountHelper")) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.add(FHA.A0G(FxcalAccountType.FACEBOOK, A002.A02(r15, "ig_android_growth_fx_access_fb_ig_autocomplete", "AutoCompleteAccountHelper"), A002.A01(r15, "ig_android_growth_fx_access_fb_ig_autocomplete", "AutoCompleteAccountHelper")));
            1OC A07 = FHA.A07(context, r15, "login", A1C);
            A07.A00 = new C47692EDb(r15, g9h2, this, 13);
            r10.schedule(A07);
            return;
        }
        1xC r1 = 1xC.A01;
        ? obj = new Object();
        obj.A00 = null;
        r1.A00(obj);
    }

    public final void A01(0lg r8, C51961G9h g9h) {
        C49632Ezp ezp;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        List list = this.A01;
        A1C.addAll(list);
        A1C2.addAll(list);
        for (ENP enp : this.mFacebookAutoCompleteAccountList) {
            if (enp != null && TextUtils.equals(FV8.A00().A01(r8, "ig_android_growth_fx_access_fb_ig_autocomplete", "AutoCompleteAccountHelper"), enp.A02)) {
                int indexOf = A1C.indexOf(enp);
                if (indexOf >= 0) {
                    A1C.set(indexOf, enp);
                } else {
                    A1C.add(enp);
                }
                A1C2.add(enp);
            }
        }
        for (Object next : this.A00) {
            if (A1C.indexOf(next) < 0) {
                A1C.add(next);
            }
            A1C2.add(next);
        }
        this.A02 = A1C;
        this.A03 = A1C2;
        if (g9h != null) {
            C50599FfE ffE = (C50599FfE) g9h;
            switch (ffE.A00) {
                case 0:
                    return;
                case 1:
                    ezp = ((Ez8) ffE.A01).A03;
                    break;
                default:
                    ezp = ((C49495Ewa) ffE.A01).A00;
                    break;
            }
            C46713Djj djj = ezp.A02;
            synchronized (djj) {
                List list2 = djj.A09;
                list2.clear();
                list2.addAll(A1C);
            }
            0fE.A00(djj, 743264062);
            if (A1C.isEmpty()) {
                ArrayAdapter arrayAdapter = ezp.A00;
                if (arrayAdapter != null && !arrayAdapter.isEmpty()) {
                    AutoCompleteTextView autoCompleteTextView = ezp.A01;
                    autoCompleteTextView.setAdapter(arrayAdapter);
                    autoCompleteTextView.setOnItemClickListener((AdapterView.OnItemClickListener) null);
                    return;
                }
                return;
            }
            AutoCompleteTextView autoCompleteTextView2 = ezp.A01;
            autoCompleteTextView2.setAdapter(djj);
            autoCompleteTextView2.setOnItemClickListener(new C50126FPq(ezp, 0));
            if (ezp.A04 == C46634DiE.A1F) {
                djj.A02 = true;
            }
        }
    }
}
