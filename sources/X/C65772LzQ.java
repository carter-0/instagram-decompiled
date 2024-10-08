package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.LzQ  reason: case insensitive filesystem */
public final class C65772LzQ implements MT1 {
    public final int A00;
    public final Object A01;

    public C65772LzQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DSd(int i, int i2) {
        View view;
        ComposerAutoCompleteTextView composerAutoCompleteTextView;
        View view2;
        MV8 mv8;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        String A0i;
        IgdsBottomButtonLayout igdsBottomButtonLayout2;
        switch (this.A00) {
            case 0:
                K6K k6k = (K6K) this.A01;
                if (k6k.A0P && (mv8 = k6k.A0C) != null) {
                    mv8.CnJ();
                }
                C65126Lno lno = k6k.A0E;
                if (k6k.A0T && lno != null) {
                    View view3 = k6k.A05;
                    if (view3 != null) {
                        C294975nL A002 = C294975nL.A00(view3);
                        0qQ.A07(A002);
                        if (A002.A0W()) {
                            C41567AwZ awZ = new C41567AwZ(41, A002, k6k, lno);
                            A002.A05 = new C65724Lye((C62320sa) awZ, 14);
                            A002.A07 = new C19674Wdc(awZ, 1);
                        } else {
                            K6K.A02(k6k, lno);
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                if (i > 0) {
                    if (i2 == 0) {
                        if (k6k.A0W) {
                            K6G A003 = K6K.A00(k6k);
                            if (!k6k.A0V || (A003 != null && A003.A02())) {
                                if (k6k.A0T) {
                                    view2 = k6k.A05;
                                } else if (k6k.A0X) {
                                    view2 = k6k.A06;
                                } else {
                                    view2 = k6k.A0I;
                                }
                                if (view2 != null) {
                                    C294975nL A0E = JTP.A0c(view2, 0).A0E(K6K.A0r);
                                    A0E.A0T((float) AnonymousClass0nB.A00(AnonymousClass7TE.A0S(view2)), 0.0f);
                                    A0E.A04 = 0;
                                    A0E.A0H();
                                }
                            }
                        }
                        if (k6k.A0W) {
                            K6K.A01((C53401GnY) null, k6k, 0, true, JTQ.A0L(k6k).A00());
                        }
                    }
                    if (k6k.A0I != null) {
                        String str = k6k.A0L;
                        if (str == null) {
                            str = DbY.A0d(DbV.A05(k6k), i, R.plurals.direct_media_composer_send_button_description);
                            0qQ.A07(str);
                        }
                        IgdsBottomButtonLayout igdsBottomButtonLayout3 = k6k.A0I;
                        if (igdsBottomButtonLayout3 != null) {
                            igdsBottomButtonLayout3.setPrimaryActionText(str);
                        }
                    }
                } else if (i == 0) {
                    if (k6k.A0T) {
                        view = k6k.A05;
                    } else if (k6k.A0X) {
                        view = k6k.A06;
                    } else {
                        view = k6k.A0I;
                    }
                    if (view != null && view.getVisibility() == 0) {
                        C294975nL A0E2 = JTP.A0b(view).A0E(K6K.A0r);
                        A0E2.A0K((float) AnonymousClass0nB.A00(AnonymousClass7TE.A0S(view)));
                        A0E2.A03 = 4;
                        A0E2.A0H();
                    }
                    C65126Lno lno2 = k6k.A0E;
                    if (!(lno2 == null || (composerAutoCompleteTextView = lno2.A00.A09) == null)) {
                        0nA.A0N(composerAutoCompleteTextView);
                    }
                }
                MV8 mv82 = k6k.A0C;
                if (mv82 != null) {
                    mv82.Dio(i);
                    return;
                }
                return;
            case 1:
                return;
            default:
                if (i > 0) {
                    if (i2 == 0 && (igdsBottomButtonLayout2 = ((K7H) this.A01).A01) != null) {
                        C294975nL A0E3 = JTP.A0c(igdsBottomButtonLayout2, 0).A0E(K7H.A08);
                        A0E3.A0T((float) AnonymousClass0nB.A00(AnonymousClass7TE.A0S(igdsBottomButtonLayout2)), 0.0f);
                        A0E3.A04 = 0;
                        A0E3.A0H();
                    }
                    K7H k7h = (K7H) this.A01;
                    IgdsBottomButtonLayout igdsBottomButtonLayout4 = k7h.A01;
                    if (igdsBottomButtonLayout4 != null) {
                        Resources A05 = DbV.A05(k7h);
                        if (i == 1) {
                            A0i = A05.getString(2131973082);
                        } else {
                            A0i = JTS.A0i(A05, i, 2131965904);
                        }
                        igdsBottomButtonLayout4.setPrimaryActionText(A0i);
                        return;
                    }
                    return;
                } else if (i == 0 && (igdsBottomButtonLayout = ((K7H) this.A01).A01) != null && igdsBottomButtonLayout.getVisibility() == 0) {
                    C294975nL A0E4 = JTP.A0b(igdsBottomButtonLayout).A0E(K7H.A08);
                    A0E4.A0K((float) AnonymousClass0nB.A00(AnonymousClass7TE.A0S(igdsBottomButtonLayout)));
                    A0E4.A03 = 4;
                    A0E4.A0H();
                    return;
                } else {
                    return;
                }
        }
    }
}
