package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import java.util.List;

public final class LOy {
    public C65063Lmh A00;
    public C65062Lmg A01;
    public C65061Lmf A02;
    public C65060Lme A03;
    public final Context A04;
    public final UserSession A05;
    public final BottomSheetViewController A06;
    public final C60230Jhn A07;
    public final C66506MUk A08;

    public final void A02(C66501MUf mUf, List list, C62320sa r13, C62320sa r14, C62320sa r15) {
        C66501MUf mUf2 = mUf;
        List list2 = list;
        AnonymousClass7TG.A1N(list, mUf);
        C65063Lmh lmh = this.A00;
        if (lmh == null) {
            lmh = new C65063Lmh(this.A05, new C65155LoK(mUf2, this, list2, r13, r14, r15));
            this.A00 = lmh;
        }
        this.A07.A00 = AnonymousClass05K.A0C;
        BottomSheetViewController bottomSheetViewController = this.A06;
        bottomSheetViewController.A03 = lmh;
        bottomSheetViewController.A02();
    }

    public final void A03(C65499LuN luN, C62320sa r5, C62320sa r6) {
        0qQ.A0B(luN, 0);
        C65060Lme lme = this.A03;
        if (lme == null) {
            lme = new C65060Lme(new C65153LoI(this, r5, r6));
            this.A03 = lme;
        }
        if (lme == null) {
            0qQ.A0F("audioTrimmerBottomSheetContentController");
            throw AnonymousClass00P.createAndThrow();
        }
        lme.A00 = luN;
        this.A07.A00 = AnonymousClass05K.A00;
        BottomSheetViewController bottomSheetViewController = this.A06;
        bottomSheetViewController.A03 = lme;
        bottomSheetViewController.A02();
    }

    public final void A01(C66534MVo mVo) {
        String str;
        C60230Jhn jhn = this.A07;
        Integer num = jhn.A00;
        if (num != null) {
            switch (num.intValue()) {
                case -1:
                case 0:
                case 3:
                case 4:
                case 5:
                    break;
                case 1:
                    jhn.A02.FIG(new KNQ(mVo));
                    jhn.A01 = mVo.getTitle();
                    break;
                case 2:
                    jhn.A02.FIG(new KNV(mVo));
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
        }
        BottomSheetViewController bottomSheetViewController = this.A06;
        String A002 = jhn.A00(this.A04);
        IgTextView igTextView = bottomSheetViewController.bottomSheetBottomTitle;
        if (igTextView != null) {
            TextView.BufferType bufferType = TextView.BufferType.NORMAL;
            igTextView.setText(A002, bufferType);
            IgTextView igTextView2 = bottomSheetViewController.bottomSheetTopTitle;
            if (igTextView2 != null) {
                igTextView2.setText(A002, bufferType);
                return;
            }
            str = "bottomSheetTopTitle";
        } else {
            str = "bottomSheetBottomTitle";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public LOy(Context context, ViewGroup viewGroup, UserSession userSession) {
        AnonymousClass7TG.A1P(userSession, viewGroup);
        this.A05 = userSession;
        this.A04 = context;
        C60230Jhn jhn = new C60230Jhn();
        this.A07 = jhn;
        C65064Lmi lmi = new C65064Lmi(this);
        this.A08 = lmi;
        this.A06 = new BottomSheetViewController(context, viewGroup, lmi);
        AnonymousClass07Z A002 = C71362ch.A00(viewGroup);
        if (A002 != null) {
            JTS.A10(A002, new MGX(this, (AnonymousClass4D7) null, 15), jhn.A03);
        }
    }

    public static final void A00(LOy lOy, C62320sa r1) {
        r1.invoke();
        BottomSheetViewController bottomSheetViewController = lOy.A06;
        MXJ mxj = bottomSheetViewController.A03;
        if (mxj != null) {
            mxj.Cyg();
        }
        bottomSheetViewController.A03 = null;
        ViewGroup viewGroup = bottomSheetViewController.bottomSheetContentView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        } else {
            0qQ.A0F("bottomSheetContentView");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
