package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.List;

/* renamed from: X.GyE  reason: case insensitive filesystem */
public final class C54029GyE extends QAN {
    public DialogInterface.OnDismissListener A00;
    public DialogInterface A01;
    public AnonymousClass0iw A02;
    public UserSession A03;
    public C255773uh A04;
    public XCI A05;
    public Integer A06;

    public final void onDismiss(DialogInterface dialogInterface) {
        0qQ.A0B(dialogInterface, 0);
        C54029GyE.super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener == null) {
            0qQ.A0F("listener");
            throw AnonymousClass00P.createAndThrow();
        } else {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.reel_report_bottom_sheet_next_button);
        IgRadioGroup igRadioGroup = (IgRadioGroup) AnonymousClass7TE.A0b(view2, R.id.reel_report_bottom_sheet_radio_group);
        UserSession userSession = this.A03;
        if (userSession == null) {
            str = "userSession";
        } else {
            C255773uh r1 = this.A04;
            if (r1 == null) {
                str = "reelItem";
            } else {
                AnonymousClass0iw r14 = this.A02;
                if (r14 == null) {
                    str = "analyticsModule";
                } else {
                    Context requireContext = requireContext();
                    C58695Iw4 iw4 = new C58695Iw4(46, (Object) A0G, (Object) this, (Object) igRadioGroup);
                    0qQ.A0B(igRadioGroup, 5);
                    C270114gD r12 = r1.A0D;
                    17k.A07(r12, C273654mx.A00(21));
                    if (r12 != null) {
                        list = r12.A00.BPz();
                    } else {
                        list = null;
                    }
                    int[] iArr = {R.id.reel_netego_threads_in_stories_item_top, R.id.reel_netego_threads_in_stories_item_middle, R.id.reel_netego_threads_in_stories_item_bottom};
                    if (list != null) {
                        int i = 0;
                        do {
                            C55880Hp1 hp1 = new C55880Hp1(view2, AnonymousClass7TF.A0G(view2, iArr[i]));
                            hp1.A04.setVisibility(8);
                            hp1.A08.setVisibility(0);
                            C55880Hp1 hp12 = hp1;
                            1Xj r16 = (1Xj) list.get(i);
                            I3u.A00(requireContext, r14, userSession, r16, (C317286n1) null, hp12, igRadioGroup, iw4, i, false, false);
                            i++;
                        } while (i < 3);
                    }
                    C56815IDm.A00(A0G, 6, this);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1375364609);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.reel_netego_threads_in_stories_report_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-2084363819, A022);
        return inflate;
    }
}
