package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView;
import com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo;

public final class PHu implements C358618bC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PHu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final boolean onToggle(boolean z) {
        int A022;
        int A07;
        String str;
        if (this.A00 != 0) {
            C68449NIn nIn = (C68449NIn) this.A02;
            C68449NIn.A02(nIn).A0F = z;
            NotesCreationBubbleView notesCreationBubbleView = nIn.A0a;
            if (notesCreationBubbleView == null) {
                str = "bubbleView";
            } else {
                Context A09 = C66580MXl.A09(this.A01);
                if (z) {
                    A022 = R.color.clips_remix_camera_outer_container_default_background;
                } else {
                    A022 = 2Yu.A02(A09);
                }
                notesCreationBubbleView.setBubbleBackgroundColor(A09.getColor(A022));
                IgEditText igEditText = nIn.A0H;
                if (igEditText == null) {
                    str = "noteEditText";
                } else {
                    if (z) {
                        A07 = R.color.canvas_bottom_sheet_description_text_color;
                    } else {
                        A07 = 2Yu.A07(A09);
                    }
                    DbT.A17(A09, igEditText, A07);
                    return true;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C72345P2k p2k = (C72345P2k) this.A02;
        p2k.A03.A00.A07 = z;
        if (!z) {
            return true;
        }
        C310336ap A0a = DbS.A0a();
        A0a.A0D = DbW.A0h(p2k.A00, ((BroadcastChannelXpostingChannelInfo) this.A01).A03, 2131958956);
        A0a.A02();
        A0a.A07(R.drawable.instagram_facebook_circle_pano_outline_24);
        DbY.A1N(A0a);
        return true;
    }
}
