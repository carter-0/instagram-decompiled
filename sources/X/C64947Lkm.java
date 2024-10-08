package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.Lkm  reason: case insensitive filesystem */
public final class C64947Lkm implements C66501MUf {
    public final /* synthetic */ C61869KPi A00;

    public final void Drb(L02 l02) {
        0qQ.A0B(l02, 0);
        try {
            UserSession A0A = this.A00.A0A();
            L2B l2b = (L2B) A0A.A01(L2B.class, new C51763G0f(A0A, 2));
            StringWriter A0v = JTO.A0v();
            17W A0K = AnonymousClass7TF.A0K(A0v);
            16P.A03(A0K, "filters");
            for (C63805L7l l7l : l02.A00) {
                if (l7l != null) {
                    A0K.A0c();
                    A0K.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l7l.A00);
                    A0K.A0S("hidden", l7l.A02);
                    A0K.A0S("new", l7l.A03);
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
            String A0k = AnonymousClass7TG.A0k(A0K, A0v);
            0xY AR4 = l2b.A00.AR4();
            AR4.E5g("photo_filter_tray", A0k);
            AR4.apply();
        } catch (IOException unused) {
        }
    }

    public final void Drc(C60060Jeb jeb) {
        0qQ.A0B(jeb, 0);
        C60070Jez jez = jeb.A05;
        C64933LkY lkY = (C64933LkY) C66568MWw.A01(jez);
        boolean z = true;
        if (lkY != null) {
            int A002 = C66568MWw.A00(jez);
            C61869KPi kPi = this.A00;
            if (A002 == kPi.A00) {
                lkY.A03 = kPi.A07;
                AnonymousClass3Q2 A0e = JTT.A0e(kPi);
                if (A0e != null) {
                    int i = A0e.A1i.A00;
                    FilterGroupModel filterGroupModel = kPi.A06;
                    if (filterGroupModel == null || !((FilterGroupModelImpl) filterGroupModel).A04) {
                        lkY.A03.put(Integer.valueOf(C66568MWw.A00(jez)), Integer.valueOf(i));
                    } else {
                        lkY.A00 = i;
                    }
                    C378369Pn r1 = kPi.A06;
                    if (r1 != null) {
                        lkY.A01(jeb, r1, (VideoFilter) null, (FilterGroupModel) null);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        if (C66568MWw.A00(jez) != this.A00.A00) {
            z = false;
        }
        jeb.setChecked(z);
    }

    public final void Drd(C60060Jeb jeb, boolean z) {
        Object value;
        Integer num;
        C60060Jeb jeb2 = jeb;
        0qQ.A0B(jeb2, 0);
        C61869KPi kPi = this.A00;
        C60070Jez jez = jeb2.A05;
        kPi.A00 = C66568MWw.A00(jez);
        C66534MVo A01 = C66568MWw.A01(jez);
        if (A01 != null) {
            C64933LkY lkY = (C64933LkY) A01;
            lkY.A03 = kPi.A07;
            AnonymousClass3Q2 A0e = JTT.A0e(kPi);
            if (A0e == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (kPi.A06 != null) {
                AnonymousClass3QG r1 = A0e.A1i;
                int i = kPi.A00;
                r1.A01 = i;
                C61869KPi.A00(kPi, A0e, i);
                C378369Pn r0 = kPi.A06;
                if (r0 != null) {
                    r0.CnC();
                }
                FilterGroupModel filterGroupModel = kPi.A06;
                C378369Pn r02 = kPi.A06;
                if (r02 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (lkY.A01(jeb2, r02, (VideoFilter) null, filterGroupModel)) {
                    if (z) {
                        if (kPi.A0A) {
                            182.A06(0Tu.A05, kPi.A0A(), 36318754556418478L);
                        }
                        05G r2 = ((C60231Jho) kPi.A0D.getValue()).A00;
                        do {
                            value = r2.getValue();
                            num = (Integer) ((C61039Jvd) value).A01;
                            0qQ.A0B(num, 0);
                        } while (!r2.AIY(value, new C61039Jvd(num, false, false, false, false, false)));
                        kPi.A04 = A01;
                        ViewSwitcher viewSwitcher = kPi.A03;
                        if (viewSwitcher != null) {
                            viewSwitcher.setDisplayedChild(1);
                        }
                        View AZq = A01.AZq(kPi.getThemedContext());
                        if (AZq != null) {
                            ViewGroup viewGroup = kPi.A02;
                            if (viewGroup != null) {
                                viewGroup.addView(AZq);
                            }
                            C59888JbD.A01(kPi.A0A(), new KPN(A01.getTitle()));
                            27r A012 = 27p.A01(kPi.A0A());
                            28t r7 = 28t.A06;
                            if (A012.A0J() != null) {
                                27r.A03(r7, C59725JVj.POST_CAPTURE, A012, "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_TAP", false, false);
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else if (z) {
                    C63912LBx A002 = C63124Krs.A00(kPi.A0A());
                    C66568MWw mWw = jez.A01;
                    0qQ.A07(mWw);
                    A002.A00(mWw.getName(), false);
                    27r A013 = 27p.A01(kPi.A0A());
                    int i2 = kPi.A00;
                    List list = kPi.A08;
                    if (list == null) {
                        0qQ.A0F("filterList");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    int A003 = C63126Kru.A00(list, i2);
                    if (A013.A0J() != null) {
                        A013.A1A(28t.A06, C59725JVj.POST_CAPTURE, i2, A003);
                    }
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public C64947Lkm(C61869KPi kPi) {
        this.A00 = kPi;
    }
}
