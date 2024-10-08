package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import java.util.Set;

/* renamed from: X.Kfd  reason: case insensitive filesystem */
public final class C62428Kfd extends C51086FoG {
    public final /* synthetic */ C60314JjH A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C62428Kfd(C60314JjH jjH, String str, String str2) {
        this.A00 = jjH;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void De7() {
        this.A00.A0D.Epw(new C61205Jyy("showReportBroadcastChannelReplyBottomSheet_request_error", 0));
    }

    public final void Do1(String str) {
        Set set;
        MediaCommentListRepository mediaCommentListRepository = this.A00.A05;
        Set A0y = JTP.A0y(this.A02);
        String str2 = this.A01;
        if (str2 != null) {
            set = JTP.A0y(str2);
        } else {
            set = 0sl.A00;
        }
        mediaCommentListRepository.A0P(A0y, set);
    }
}
