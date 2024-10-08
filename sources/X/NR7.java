package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.List;
import java.util.Map;

public final class NR7 extends AnonymousClass0mG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NR7(C328667Fr r3, C72565PAw pAw) {
        super(1000);
        this.A00 = 0;
        this.A02 = pAw;
        this.A01 = r3;
    }

    public final void A00(View view) {
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                P8B p8b = ((C72565PAw) this.A02).A06;
                C328667Fr r1 = (C328667Fr) this.A01;
                O76 o76 = p8b.A00;
                AnonymousClass77A r0 = r1.A0H;
                if (r0 == null || (str3 = Long.valueOf(r0.A00).toString()) == null) {
                    str3 = "";
                }
                0Aj A0e = AnonymousClass7TE.A0e(o76.A00, "open_existing_poll");
                C69457Nm1 nm1 = C69457Nm1.POLL_XMA_VOTE_BUTTON;
                0bb r3 = new 0bb();
                r3.A06("question_id", str3);
                r3.A01(nm1, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                C66583MXo.A13(A0e, r3);
                List list = r1.A0b;
                if (list != null && 0 < list.size()) {
                    AnonymousClass9JN r02 = (AnonymousClass9JN) list.get(0);
                    String str4 = r02.A04;
                    String str5 = r02.A05;
                    String str6 = r02.A06;
                    String str7 = r02.A02;
                    String str8 = r02.A03;
                    if (str5 == null) {
                        str = "PollMessageClickDelegate";
                        str2 = "Null XMA CTA Type";
                        break;
                    } else {
                        AnonymousClass7Ws r32 = p8b.A01;
                        if (!((C333107Xr) r32).CPk()) {
                            String str9 = r1.A08.A00;
                            r32.CJS((RectF) null, r1.A0B.A04, r1.A0L, (GradientSpinner) null, 0, str4, str5, str6, str7, str8, str9, ((C332877Wu) r32).C6X(), (String) null, (String) null, (Map) null);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                C328667Fr r33 = (C328667Fr) this.A01;
                DirectMessageIdentifier directMessageIdentifier = r33.A0L;
                if (directMessageIdentifier.A02 != null) {
                    P8E p8e = ((C72563PAu) this.A02).A0A;
                    List list2 = r33.A0b;
                    if (list2 != null) {
                        AnonymousClass9JN r03 = (AnonymousClass9JN) list2.get(0);
                        String str10 = r03.A04;
                        String str11 = r03.A05;
                        String str12 = r03.A06;
                        String str13 = r03.A02;
                        String str14 = r03.A03;
                        if (str12 == null) {
                            str = "PromptXmaMessageClickDelegate";
                            str2 = "Null CTA fields";
                            break;
                        } else {
                            AnonymousClass7X1 r12 = p8e.A01;
                            if (r12 != null) {
                                ((AnonymousClass7Ws) r12).CJS((RectF) null, r33.A0B.A04, directMessageIdentifier, (GradientSpinner) null, 0, str10, str11, str12, str13, str14, r33.A08.A00, ((C332877Wu) r12).C6X(), directMessageIdentifier.A00, (String) null, (Map) null);
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
        0wb.A03(str, str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NR7(C328667Fr r3, C72563PAu pAu, int i) {
        super(2000);
        this.A00 = i;
        this.A01 = r3;
        this.A02 = pAu;
    }
}
