package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8us  reason: invalid class name and case insensitive filesystem */
public class C369508us extends C306386Ly implements C41816B1w, C300645xY, C300655xZ {
    public final User A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C369508us(Context context, User user, String str, int i) {
        super(context, i);
        0qQ.A0B(str, 4);
        this.A00 = user;
        this.A01 = str;
    }

    public final void AGn(C21236XQh xQh, int i) {
        0qQ.A0B(xQh, 0);
        Spannable spannable = this.A0F;
        0qQ.A07(spannable);
        Resources resources = this.A0Z.getResources();
        0qQ.A07(resources);
        AJB.A09(resources, spannable, AnonymousClass1GB.A01(this.A00), xQh.A00(i), xQh.A01(i));
        A0R();
    }

    public final Drawable AKn(String str) {
        0qQ.A0B(str, 0);
        Context context = this.A0Z;
        0qQ.A07(context);
        C369508us r3 = new C369508us(context, this.A00, str, this.A07);
        TextPaint textPaint = this.A0b;
        r3.A0I(textPaint.getTypeface());
        AJB.A0B(r3, textPaint.getTextSize(), this.A00, this.A01);
        r3.A0L(new SpannableString(this.A0F.toString()));
        return r3;
    }

    public final int BRc() {
        if (this.A00 != null) {
            return 1;
        }
        return 0;
    }

    public final List BRk() {
        List singletonList = Collections.singletonList(this.A00);
        0qQ.A07(singletonList);
        ArrayList arrayList = new ArrayList();
        for (Object next : singletonList) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final String C4F() {
        return this.A01;
    }
}
