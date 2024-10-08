package X;

import com.instagram.user.model.User;

/* renamed from: X.AwN  reason: case insensitive filesystem */
public final /* synthetic */ class C41555AwN extends 03J implements 0sP {
    public C41555AwN(Object obj) {
        super(1, obj, C358548b5.class, "onMentionSuggestionTapped", "onMentionSuggestionTapped(Lcom/instagram/creation/capture/quickcapture/mention/MentionTaggingViewBinder$ViewHolder;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C387779ml r4 = (C387779ml) obj;
        0qQ.A0B(r4, 0);
        C358548b5 r2 = (C358548b5) this.receiver;
        if (r2.A03.size() < 20) {
            C358538b4 r22 = r2.A00;
            User user = r4.A02;
            if (user != null) {
                r22.DRH(user, r4.getBindingAdapterPosition());
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            C39582A0y.A00(AnonymousClass7TE.A0S(r4.itemView), 20);
        }
        return C60340gF.A00;
    }
}
