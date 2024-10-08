package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.AbstractList;
import java.util.List;

/* renamed from: X.GiU  reason: case insensitive filesystem */
public final class C53096GiU extends C249403jg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C53096GiU(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        2Wa r5;
        ValueAnimator ofFloat;
        int i4;
        C228432lf r1;
        View A032;
        C228432lf r12;
        View A033;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A03(1123763573);
                if (i == 0) {
                    recyclerView.announceForAccessibility(((TextView) this.A02).getText());
                }
                i3 = -1126990581;
                break;
            case 1:
                i2 = AnonymousClass7TG.A0D(recyclerView, 1896427939);
                if (i == 0) {
                    VAD.A00((C61071Jw9) this.A02, (C14873UDb) this.A01, (UserSession) this.A03);
                }
                super.onScrollStateChanged(recyclerView, i);
                i3 = 688154723;
                break;
            case 4:
                i2 = AnonymousClass7TG.A0D(recyclerView, 2110026);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    OZV ozv = (OZV) this.A03;
                    int A1a = ozv.A09.A1a();
                    List list = (List) this.A01;
                    int size = list.size() - 1;
                    while (true) {
                        if (-1 < size) {
                            Number A14 = C51966G9m.A14(((C70594OCr) list.get(size)).A00, ozv.A0C.A04);
                            if (A14 == null || A1a < A14.intValue()) {
                                size--;
                            } else {
                                ((C60061Jec) this.A02).A01(size, true);
                            }
                        }
                    }
                }
                i3 = -483986349;
                break;
            case 5:
                i2 = AnonymousClass0fD.A03(700091701);
                0qQ.A0B(recyclerView, 0);
                2Wa r4 = (2Wa) this.A02;
                Object obj = r4.A03;
                if (obj == C54619HLc.ANIMATING) {
                    i3 = -135383656;
                    break;
                } else {
                    if (recyclerView.canScrollHorizontally(-1) || i != 0 || obj == C54619HLc.EXPANDED) {
                        if (obj != C54619HLc.COLLAPSED) {
                            r5 = (2Wa) this.A01;
                            float[] A1b = C51965G9l.A1b();
                            A1b[0] = AnonymousClass7TE.A04(r5.A03);
                            A1b[1] = 0.65f;
                            ofFloat = ValueAnimator.ofFloat(A1b);
                            ofFloat.setDuration(200);
                            ofFloat.addListener(new C52775GcS(r4, 0));
                            i4 = 18;
                        }
                        i3 = 559835206;
                        break;
                    } else {
                        r5 = (2Wa) this.A01;
                        float[] A1b2 = C51965G9l.A1b();
                        A1b2[0] = AnonymousClass7TE.A04(r5.A03);
                        A1b2[1] = 1.0f;
                        ofFloat = ValueAnimator.ofFloat(A1b2);
                        ofFloat.setDuration(200);
                        ofFloat.addListener(new C52775GcS(r4, 1));
                        i4 = 19;
                    }
                    I84.A01(ofFloat, r5, i4);
                    ofFloat.start();
                    i3 = 559835206;
                }
            case 6:
                i2 = AnonymousClass7TG.A0D(recyclerView, -1215115383);
                C337727go r0 = ((C334997cD) this.A02).A01;
                if (r0 != null && (r1 = r0.A00) != null && (A032 = r1.A03(recyclerView.A0D)) != null) {
                    if (recyclerView.A0D == null) {
                        i3 = 1854088960;
                        break;
                    } else {
                        int A06 = C252553pI.A06(A032);
                        if (A06 >= 0) {
                            C53916GwM gwM = (C53916GwM) this.A03;
                            List list2 = gwM.A05;
                            if (A06 < list2.size()) {
                                C51967G9n.A1H((2Wa) this.A01, A06);
                                0sP r13 = gwM.A07;
                                if (r13 != null) {
                                    r13.invoke(list2.get(A06));
                                }
                            }
                        }
                        i3 = -1081905978;
                        break;
                    }
                } else {
                    i3 = -1290435634;
                    break;
                }
                break;
            case 7:
                i2 = AnonymousClass7TG.A0D(recyclerView, 927109154);
                C337727go r02 = ((C334997cD) this.A02).A01;
                if (r02 != null && (r12 = r02.A00) != null && (A033 = r12.A03(recyclerView.A0D)) != null) {
                    if (recyclerView.A0D == null) {
                        i3 = 854099512;
                        break;
                    } else {
                        int A062 = C252553pI.A06(A033);
                        if (A062 >= 0 && A062 < ((C53701Gss) this.A03).A00.size()) {
                            C51967G9n.A1H((2Wa) this.A01, A062);
                        }
                        i3 = -2007066770;
                        break;
                    }
                } else {
                    i3 = 1350379819;
                    break;
                }
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
        }
        AnonymousClass0fD.A0A(i3, i2);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        int A1b;
        int i5;
        int size;
        switch (this.A00) {
            case 0:
                i3 = AnonymousClass0fD.A03(496143394);
                QCH qch = (QCH) this.A01;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) qch.A02.A0D;
                if (i < 0) {
                    A1b = linearLayoutManager.A1a();
                } else {
                    A1b = linearLayoutManager.A1b();
                }
                QEc qEc = (QEc) this.A03;
                qch.A07 = qEc.A01(A1b);
                ((TextView) this.A02).setText(qEc.A01(A1b).A01(qEc.A01));
                i4 = -789925490;
                break;
            case 2:
                i3 = AnonymousClass7TG.A0D(recyclerView, -1865987142);
                C252553pI r0 = recyclerView.A0D;
                if (r0 != null) {
                    i5 = r0.A0U();
                } else {
                    i5 = 0;
                }
                AbstractList abstractList = (AbstractList) this.A01;
                if (!abstractList.isEmpty() && (size = (i5 / abstractList.size()) - ((C54226H3v) this.A02).A00) != 0) {
                    C47482E4h e4h = (C47482E4h) this.A03;
                    int A012 = C240113Jq.A01(recyclerView.A0D) / size;
                    e4h.A00 = A012;
                    C47482E4h.A01((EX0) ((0eP) abstractList.get(A012)).A01, e4h, (String) ((0eP) abstractList.get(A012)).A00);
                }
                i4 = 1286430202;
                break;
            case 3:
                i3 = AnonymousClass0fD.A03(-1024541469);
                C60108Jfo jfo = (C60108Jfo) this.A02;
                if (!jfo.A07 && i != 0) {
                    LPJ lpj = (LPJ) this.A03;
                    C62517Kh8 A0B = lpj.A0B();
                    if (A0B != C62517Kh8.TIMED_ELEMENTS_TRACK || jfo.A02 != lpj.A08()) {
                        if (A0B != C62517Kh8.AUDIO_TRACK || jfo.A00 != lpj.A08()) {
                            if (A0B != C62517Kh8.VOICEOVER_TRACK || jfo.A04 != lpj.A08()) {
                                C62517Kh8 kh8 = C62517Kh8.VIDEO_TRACK;
                                if (A0B == kh8 && jfo.A08) {
                                    jfo.A08 = false;
                                    i4 = -1087226154;
                                    break;
                                } else {
                                    int i6 = lpj.A00 + i;
                                    int A07 = C51970G9q.A07(i6, i6);
                                    lpj.A00 = A07;
                                    if (A0B == kh8) {
                                        jfo.A0O(A07);
                                    }
                                    DbS.A1U(this.A01);
                                    i4 = -938371257;
                                    break;
                                }
                            } else {
                                jfo.A04 = AnonymousClass972.MUTABLE_FLAG_MASK;
                                i4 = 1692748051;
                                break;
                            }
                        } else {
                            jfo.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
                            i4 = 1382147758;
                            break;
                        }
                    } else {
                        jfo.A02 = AnonymousClass972.MUTABLE_FLAG_MASK;
                        i4 = 596102703;
                        break;
                    }
                } else {
                    i4 = 1325144349;
                    break;
                }
                break;
            default:
                super.onScrolled(recyclerView, i, i2);
                return;
        }
        AnonymousClass0fD.A0A(i4, i3);
    }
}
