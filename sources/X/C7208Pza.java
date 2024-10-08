package X;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.Pza  reason: case insensitive filesystem */
public final class C7208Pza extends AnonymousClass2OL {
    public final Gson A00;
    public final 2G6 A01;
    public final TypeToken A02;
    public final C13657TeO A03;
    public final C13658TeP A04;
    public final C7209Pzb A05 = new C7209Pzb(this);
    public final boolean A06;
    public volatile TypeAdapter A07;

    public final TypeAdapter A00() {
        if (this.A04 != null) {
            return this;
        }
        TypeAdapter typeAdapter = this.A07;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter A022 = this.A00.A02(this.A01, this.A02);
        this.A07 = A022;
        return A022;
    }

    public final Object read(JsonReader jsonReader) {
        C13657TeO teO = this.A03;
        if (teO == null) {
            TypeAdapter typeAdapter = this.A07;
            if (typeAdapter == null) {
                typeAdapter = this.A00.A02(this.A01, this.A02);
                this.A07 = typeAdapter;
            }
            return typeAdapter.read(jsonReader);
        }
        JsonElement A002 = C9746Rg4.A00(jsonReader);
        if (!this.A06 || !(A002 instanceof R2D)) {
            return teO.deserialize(A002, this.A02.type, this.A05);
        }
        return null;
    }

    public final void write(JsonWriter jsonWriter, Object obj) {
        C13658TeP teP = this.A04;
        if (teP == null) {
            TypeAdapter typeAdapter = this.A07;
            if (typeAdapter == null) {
                typeAdapter = this.A00.A02(this.A01, this.A02);
                this.A07 = typeAdapter;
            }
            typeAdapter.write(jsonWriter, obj);
        } else if (!this.A06 || obj != null) {
            AnonymousClass2GA.A0F.write(jsonWriter, teP.serialize(obj, this.A02.type, this.A05));
        } else {
            jsonWriter.A0A();
        }
    }

    public C7208Pza(Gson gson, C13657TeO teO, C13658TeP teP, 2G6 r5, TypeToken typeToken, boolean z) {
        this.A04 = teP;
        this.A03 = teO;
        this.A00 = gson;
        this.A02 = typeToken;
        this.A01 = r5;
        this.A06 = z;
    }
}
