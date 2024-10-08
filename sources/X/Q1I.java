package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.HashSet;

public final class Q1I extends HashSet {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q1I(int i) {
        super(12);
        Object obj;
        this.A00 = i;
        switch (i) {
            case 0:
                add("street-address");
                add("address-line1");
                add("address-line2");
                add("address-line3");
                add("address-level1");
                add("address-level2");
                add("address-level3");
                add("address-level4");
                add("country");
                add("country-name");
                obj = "postal-code";
                break;
            case 1:
                obj = "email";
                break;
            case 2:
                add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                add("given-name");
                obj = "family-name";
                break;
            case 3:
                add("tel");
                add("tel-country-code");
                add("tel-national");
                add("tel-area-code");
                add("tel-local");
                add("tel-local-prefix");
                obj = "tel-local-suffix";
                break;
            case 4:
                SparseArray sparseArray = C11147SCc.A00;
                A00(sparseArray, this, 46);
                A00(sparseArray, this, 47);
                A00(sparseArray, this, 69);
                A00(sparseArray, this, 70);
                A00(sparseArray, this, 95);
                A00(sparseArray, this, 96);
                A00(sparseArray, this, 59);
                A00(sparseArray, this, 97);
                A00(sparseArray, this, 76);
                A00(sparseArray, this, 137);
                A00(sparseArray, this, 79);
                A00(sparseArray, this, 80);
                A00(sparseArray, this, 178);
                A00(sparseArray, this, 241);
                obj = sparseArray.get(34);
                break;
            case 5:
                add("feed_suite_organic_campaign");
                add("story_suite_organic_campaign");
                obj = "interest_story";
                break;
            case 6:
                add(AnonymousClass000.A00(2756));
                obj = AnonymousClass000.A00(1372);
                break;
            case 7:
                obj = "follower_activity";
                break;
            case 8:
                add("saved_music");
                obj = "saved_original_audio";
                break;
            default:
                obj = "bookmarked";
                break;
        }
        add(obj);
    }

    public final /* bridge */ boolean contains(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains(obj);
            default:
                return super.contains(obj);
        }
    }

    public final /* bridge */ boolean remove(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.remove(obj);
            default:
                return super.remove(obj);
        }
    }

    public final /* bridge */ int size() {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return super.size();
            default:
                return super.size();
        }
    }

    public static void A00(SparseArray sparseArray, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(sparseArray.get(i));
    }
}
