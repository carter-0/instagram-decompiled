package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.instagram.android.R;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UjZ  reason: case insensitive filesystem */
public final class C15849UjZ extends UAJ {
    public static final Typeface A0D = Typeface.create("sans-serif-medium", 0);
    public static final Typeface A0E = Typeface.create("sans-serif-light", 0);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final ColorFilter A07;
    public final Drawable A08 = new ShapeDrawable(new OvalShape());
    public final ArchiveReelCalendarFragment A09;
    public final AnonymousClass0iw A0A;
    public final List A0B;
    public final Map A0C;

    static {
        Color.argb(255, 232, 255, 186);
    }

    public final int A02(Reel reel) {
        Date date = (Date) this.A0C.get(reel.getId());
        if (date == null) {
            return -1;
        }
        return DbX.A02(C51966G9m.A14(A01(date), this.A03));
    }

    public C15849UjZ(Context context, ArchiveReelCalendarFragment archiveReelCalendarFragment, AnonymousClass0iw r8) {
        this.A06 = context;
        this.A0B = new ArrayList();
        this.A0C = new HashMap();
        Resources resources = context.getResources();
        this.A09 = archiveReelCalendarFragment;
        this.A0A = r8;
        int A032 = JTP.A03(resources);
        int floor = (int) Math.floor((double) ((0nA.A09(context) - (AnonymousClass7TE.A0F(resources) * 2)) / UAJ.A05));
        this.A01 = floor;
        this.A04 = floor - (A032 * 2);
        this.A02 = context.getColor(R.color.grey_5);
        this.A03 = context.getColor(R.color.grey_2);
        this.A05 = context.getColor(R.color.grey_1);
        this.A07 = AnonymousClass37O.A00(Color.argb(30, 0, 0, 0));
        setHasStableIds(true);
    }

    public final long getItemId(int i) {
        long j = (long) i;
        AnonymousClass0fD.A0A(-1310275661, AnonymousClass0fD.A03(-744654409));
        return j;
    }
}
