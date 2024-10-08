package X;

import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* renamed from: X.KNv  reason: case insensitive filesystem */
public final class C61832KNv extends C62779KmH {
    public final PublishScreenCategoryType A00;

    public C61832KNv(PublishScreenCategoryType publishScreenCategoryType) {
        0qQ.A0B(publishScreenCategoryType, 1);
        this.A00 = publishScreenCategoryType;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61832KNv) && this.A00 == ((C61832KNv) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CategoryRowItem(category=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
