package X;

import com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.6Ym  reason: invalid class name and case insensitive filesystem */
public final class C309496Ym {
    public int A00 = -1;
    public List A01 = 0sn.A00;
    public C262204Co A02;
    public 05G A03 = new 02z(false);
    public final C62320sa A04;
    public final 0sK A05;
    public final C262224Cq A06;

    public C309496Ym(C62320sa r3, 0sK r4, C262224Cq r5) {
        0qQ.A0B(r5, 1);
        this.A06 = r5;
        this.A05 = r4;
        this.A04 = r3;
    }

    public final void A00() {
        this.A03.Epw(true);
    }

    public final void A01() {
        this.A03.Epw(false);
    }

    public final void A02(List list) {
        C262204Co r0 = this.A02;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A02 = null;
        this.A01 = list;
        if (!list.isEmpty()) {
            C262224Cq r3 = this.A06;
            StoryCommentsViewModel$CommentRotation$rotate$1 storyCommentsViewModel$CommentRotation$rotate$1 = new StoryCommentsViewModel$CommentRotation$rotate$1(this, list, (AnonymousClass4D7) null);
            this.A02 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, storyCommentsViewModel$CommentRotation$rotate$1, r3);
        }
    }
}
