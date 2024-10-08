package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.T4z  reason: case insensitive filesystem */
public final class C12739T4z implements 2G6 {
    public final /* synthetic */ TypeAdapter A00;
    public final /* synthetic */ TypeToken A01;

    public C12739T4z(TypeAdapter typeAdapter, TypeToken typeToken) {
        this.A01 = typeToken;
        this.A00 = typeAdapter;
    }

    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (typeToken.equals(this.A01)) {
            return this.A00;
        }
        return null;
    }
}
