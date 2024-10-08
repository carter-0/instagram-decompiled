package X;

import com.instagram.tagging.activity.TaggingActivity;

/* renamed from: X.Ka5  reason: case insensitive filesystem */
public final class C62100Ka5 extends C64682LgA {
    public final /* synthetic */ TaggingActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62100Ka5(TaggingActivity taggingActivity) {
        super(taggingActivity);
        this.A00 = taggingActivity;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(892859075);
        C62153KbB kbB = (C62153KbB) obj;
        int A0D = AnonymousClass7TG.A0D(kbB, 699801986);
        TaggingActivity taggingActivity = this.A00;
        String str = kbB.A01;
        if (str == null) {
            str = "";
        }
        TaggingActivity.A0N(taggingActivity, kbB.A00, str);
        AnonymousClass0fD.A0A(-620666010, A0D);
        AnonymousClass0fD.A0A(377483842, A03);
    }
}
