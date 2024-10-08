package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.memories.model.MemoryItem;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9YO  reason: invalid class name */
public final class AnonymousClass9YO extends 2Rw {
    public final C384969iB A00;
    public final GradientDrawable A01;
    public final UserSession A02;
    public final HashMap A03;
    public final List A04;

    public AnonymousClass9YO(GradientDrawable gradientDrawable, UserSession userSession, C384969iB r4, HashMap hashMap, List list) {
        AnonymousClass7TG.A0w(1, userSession, list, hashMap);
        0qQ.A0B(gradientDrawable, 5);
        this.A02 = userSession;
        this.A04 = list;
        this.A03 = hashMap;
        this.A01 = gradientDrawable;
        this.A00 = r4;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        return new C380609Yv(context, this.A01, LayoutInflater.from(context).inflate(i, viewGroup, false), this.A02);
    }

    public final void onBindViewHolder(C249703kE r24, int i) {
        C249703kE r1 = r24;
        0qQ.A0B(r1, 0);
        C380609Yv r12 = (C380609Yv) r1;
        int i2 = i;
        MemoryItem memoryItem = (MemoryItem) this.A04.get(i2);
        HashMap hashMap = this.A03;
        C40017ANz aNz = new C40017ANz(this, i2, 0);
        int ordinal = memoryItem.A00.ordinal();
        if (ordinal == 0) {
            C45388CvU cvU = memoryItem.A01;
            cvU.getClass();
            1Xj r2 = cvU.A01;
            r2.getClass();
            r12.A00 = r2;
            boolean containsKey = hashMap.containsKey(r2.getId());
            1Xj r6 = r12.A00;
            if (containsKey) {
                Object obj = hashMap.get(r6.getId());
                obj.getClass();
                C380609Yv.A00((Medium) obj, r12);
            } else {
                Context context = r12.A0A;
                C290815g0 A032 = C59730JVo.A03(context, r12.A0C, C59730JVo.A05(context, r6, "CanvasMemoriesViewHolder", false, false));
                A032.A00 = new C385899ji(4, r12, hashMap, r6);
                1ES.A03(A032);
            }
        } else if (ordinal == 1) {
            C45388CvU cvU2 = memoryItem.A01;
            cvU2.getClass();
            1Xj r13 = cvU2.A01;
            r13.getClass();
            r12.A00 = r13;
            Context context2 = r12.A0B.getContext();
            UserSession userSession = r12.A0C;
            int i3 = r12.A03;
            int i4 = r12.A02;
            0qQ.A0B(context2, 0);
            C347017w8 A002 = AHL.A00(context2, (Drawable) null, userSession, (C3498682d) null, r13, r13, (Integer) null, "canvas_memories_bottom_sheet_fragment", i3, i4, 0, 0, false, false);
            if (A002.A08.size() > 1) {
                A002.A0B(1);
            }
            IgImageView igImageView = r12.A0D;
            igImageView.setImageDrawable(A002);
            igImageView.getLayoutParams().width = r12.A04;
            igImageView.getLayoutParams().height = r12.A01;
        } else if (ordinal == 2) {
            User user = memoryItem.A01.A02;
            user.getClass();
            IgImageView igImageView2 = r12.A0D;
            igImageView2.setImageDrawable(new C386019jv(r12.A0A, r12.A0C, user));
            igImageView2.getLayoutParams().width = r12.A05;
        }
        IgImageView igImageView3 = r12.A0E;
        Context context3 = r12.A0A;
        UserSession userSession2 = r12.A0C;
        C369868vS r62 = new C369868vS(context3, userSession2, C387149lk.A01(context3, memoryItem), C387149lk.A00(context3, userSession2, memoryItem), r12.A06, r12.A08, r12.A09, r12.A07);
        C306386Ly r4 = r62.A01;
        AnonymousClass7TG.A1N(context3, r4);
        AnonymousClass7TE.A1X(0qm.A12, AnonymousClass0qo.A00(context3), r4);
        igImageView3.setImageDrawable(r62);
        AnonymousClass0fU.A00(aNz, r12.A0B);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(105660143);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(-1455403682, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(-1930171280, AnonymousClass0fD.A03(-1164331210));
        return R.layout.canvas_memories_item;
    }
}
