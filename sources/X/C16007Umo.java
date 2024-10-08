package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Umo  reason: case insensitive filesystem */
public final class C16007Umo extends C15313UaK {
    public static final String __redex_internal_original_name = "LeadGenConsumerFragment";
    public View A00;
    public AnonymousClass3E6 A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final C252213ok A05 = new WTW(this, 2);

    public final String getModuleName() {
        return "organic_lead_gen_consumer";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A00 = view2.requireViewById(R.id.main_container);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A01 = A012;
        A012.A9Y(this.A05);
        C16057Unk unk = (C16057Unk) this.A04.getValue();
        LeadGenConsumerFormData leadGenConsumerFormData = unk.A05;
        if (leadGenConsumerFormData != null) {
            String str = leadGenConsumerFormData.A09;
            0qQ.A0B(str, 0);
            unk.A00 = str;
            unk.A00 = leadGenConsumerFormData.A0D;
            05G r1 = unk.A0F;
            AnonymousClass7TF.A1O(r1, leadGenConsumerFormData.A0C);
            if (!DbX.A1b(r1)) {
                WYY.A01(unk.A04, "consumer_question_screen_impression", "impression", unk.A00, unk.A00);
            }
            List list = leadGenConsumerFormData.A0B;
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Object next : list) {
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) next;
                if (unk.A05() && !z && leadGenFormBaseQuestion.A03 == C16595Uxp.A06 && AnonymousClass7TE.A1b(leadGenFormBaseQuestion.A0D)) {
                    z = true;
                } else if (leadGenFormBaseQuestion.A03 == C16595Uxp.A06) {
                    arrayList.add(next);
                }
            }
            05G r5 = unk.A0D;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C13991Tnr.A1N(arrayList2, it);
            }
            r5.Epw(arrayList2);
            unk.A0C.Epw(arrayList);
            05G r12 = unk.A0G;
            String str2 = leadGenConsumerFormData.A07;
            ImageUrl imageUrl = leadGenConsumerFormData.A03;
            int i = leadGenConsumerFormData.A01;
            int size = arrayList.size();
            ImageUrl imageUrl2 = leadGenConsumerFormData.A04;
            boolean A1a = DbW.A1a(imageUrl2);
            String str3 = leadGenConsumerFormData.A0A;
            r12.Epw(new C15027UKg(W33.A01(str3), imageUrl, imageUrl2, AnonymousClass05K.A00, str2, 0sn.A00, i, size, A1a));
            if (!A1a) {
                if (str3 != null) {
                    WYY.A01(unk.A04, "consumer_welcome_message_impression", "impression", unk.A00, unk.A00);
                }
                if (imageUrl2 != null) {
                    WYY.A01(unk.A04, "consumer_header_image_impression", "impression", unk.A00, unk.A00);
                }
            }
            unk.A0I.Epw(leadGenConsumerFormData.A05);
            unk.A0E.Epw(new N4R((C266444Yx) null, (Integer) null, 2));
        }
    }

    public C16007Umo() {
        C20691WxN wxN = new C20691WxN(this, 12);
        C20691WxN wxN2 = new C20691WxN(this, 4);
        0eO r8 = 0eO.A02;
        AnonymousClass0eM A002 = C20691WxN.A00(wxN2, r8, 5);
        this.A04 = new C227862kA(new C20691WxN(A002, 6), wxN, new C20612Wvt(6, (Object) null, A002), new 0Yh(C16057Unk.class));
        C20691WxN wxN3 = new C20691WxN(this, 10);
        AnonymousClass0eM A003 = C20691WxN.A00(new C20691WxN(this, 7), r8, 8);
        this.A02 = new C227862kA(new C20691WxN(A003, 9), wxN3, new C20612Wvt(7, (Object) null, A003), new 0Yh(C16042UnV.class));
        C20691WxN wxN4 = new C20691WxN(this, 11);
        AnonymousClass0eM A004 = C20691WxN.A00(new C20691WxN(this, 1), r8, 2);
        this.A03 = new C227862kA(new C20691WxN(A004, 3), wxN4, new C20612Wvt(5, (Object) null, A004), new 0Yh(C14771U8h.class));
    }

    public static final void A02(C16007Umo umo, boolean z) {
        0hq parentFragmentManager = umo.getParentFragmentManager();
        String A002 = AnonymousClass000.A00(1546);
        if (parentFragmentManager.A0R(A002) == null || (((C14773U8j) umo.A04.getValue()).A05() && !z)) {
            DbX.A0N(umo.requireActivity(), umo.A0G).A06();
        } else {
            DbX.A0N(umo.requireActivity(), umo.A0G).A0G(A002, 1);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-862754401);
        C16007Umo.super.onCreate(bundle);
        Dbb.A1N(this);
        AnonymousClass0fD.A09(-484963767, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-872626769);
        super.onDestroy();
        AnonymousClass3E6 r0 = this.A01;
        if (r0 != null) {
            r0.onDestroy();
        }
        AnonymousClass0fD.A09(122612703, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1322244343);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass3E6 r1 = this.A01;
        if (r1 != null) {
            r1.EEH(this.A05);
        }
        AnonymousClass0fD.A09(-1880485576, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-786911747);
        C16007Umo.super.onPause();
        DbS.A1D(this);
        AnonymousClass0fD.A09(-1338315381, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1007486574);
        super.onStart();
        AnonymousClass3E6 r0 = this.A01;
        if (r0 != null) {
            JTP.A17(this, r0);
        }
        AnonymousClass0fD.A09(-242663868, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1765815970);
        super.onStop();
        AnonymousClass3E6 r0 = this.A01;
        if (r0 != null) {
            r0.onStop();
        }
        AnonymousClass0fD.A09(1059348750, A022);
    }
}
