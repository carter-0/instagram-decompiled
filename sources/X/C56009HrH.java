package X;

import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HrH  reason: case insensitive filesystem */
public class C56009HrH {
    public User A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public NoteCustomTheme A0C;
    public final C2809354u A0D;

    public final C2809254t A00() {
        NoteCustomThemeImpl noteCustomThemeImpl;
        ArrayList arrayList = null;
        1E9 r5 = new 1E9(new 1hu((UserSession) null), 6, false);
        Integer num = this.A03;
        Long l = this.A04;
        NoteCustomTheme noteCustomTheme = this.A0C;
        if (noteCustomTheme != null) {
            noteCustomThemeImpl = noteCustomTheme.F6q();
        } else {
            noteCustomThemeImpl = null;
        }
        List list = this.A0A;
        Long l2 = this.A05;
        Boolean bool = this.A01;
        String str = this.A06;
        String str2 = this.A07;
        List<NoteEmojiReactionInfoIntf> list2 = this.A0B;
        if (list2 != null) {
            arrayList = AnonymousClass7TG.A0r(list2);
            for (NoteEmojiReactionInfoIntf F6r : list2) {
                arrayList.add(F6r.F6r(r5));
            }
        }
        return new C2809254t(noteCustomThemeImpl, this.A00, bool, this.A02, num, l, l2, str, str2, this.A08, this.A09, list, arrayList);
    }

    public C56009HrH(C2809354u r2) {
        this.A0D = r2;
        this.A03 = r2.AdI();
        this.A04 = r2.AsC();
        this.A0C = r2.Auz();
        this.A0A = r2.Azi();
        this.A05 = r2.B2l();
        this.A01 = r2.BCJ();
        this.A06 = r2.getId();
        this.A07 = r2.getMediaId();
        this.A0B = r2.Bjr();
        this.A08 = r2.getText();
        this.A00 = r2.CCd();
        this.A09 = r2.getUserId();
        this.A02 = r2.CF2();
    }
}
