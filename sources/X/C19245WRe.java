package X;

/* renamed from: X.WRe  reason: case insensitive filesystem */
public final class C19245WRe implements AnonymousClass1FD {
    public static final C19245WRe A00 = new C19245WRe();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.ULG, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r5) {
        /*
            r4 = this;
            r2 = 0
            X.0qQ.A0B(r5, r2)
            r1 = 0
            java.lang.String r0 = ""
            X.ULG r3 = new X.ULG
            r3.<init>()
            X.ULG.A00(r3, r2)
            r3.A03 = r1
            r3.A0C = r1
            r3.A00 = r1
            r3.A0L = r1
            r3.A0D = r0
            r3.A0E = r1
            r3.A01 = r1
            r3.A02 = r1
            r3.A0N = r2
            r3.A0F = r1
            r3.A0G = r1
            r3.A0H = r1
            r3.A0I = r1
            r3.A0J = r1
            r3.A0K = r1
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x003d
            java.lang.String r1 = "JSON string for TrackData should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x003d:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0203
            java.lang.String r1 = X.AnonymousClass7TE.A17(r5)
            if (r1 == 0) goto L_0x01fe
            int r0 = r1.hashCode()
            switch(r0) {
                case -2061768941: goto L_0x01ee;
                case -2060497896: goto L_0x01de;
                case -1755167329: goto L_0x01b5;
                case -512645821: goto L_0x01a5;
                case -310659645: goto L_0x0195;
                case -220872642: goto L_0x0185;
                case -45086183: goto L_0x0175;
                case -22609914: goto L_0x0165;
                case 3355: goto L_0x014b;
                case 55068821: goto L_0x013b;
                case 110371416: goto L_0x012b;
                case 527639047: goto L_0x0117;
                case 574519571: goto L_0x0107;
                case 682262252: goto L_0x00f7;
                case 932670004: goto L_0x00e7;
                case 1025801609: goto L_0x00d7;
                case 1128191036: goto L_0x00c8;
                case 1258734948: goto L_0x00b9;
                case 1357418199: goto L_0x00aa;
                case 1436807532: goto L_0x009b;
                case 1470663792: goto L_0x008c;
                case 1545396879: goto L_0x007d;
                case 1630845353: goto L_0x006e;
                case 1988432185: goto L_0x005f;
                default: goto L_0x0052;
            }
        L_0x0052:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "TrackDataJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x005b:
            r5.A0z()
            goto L_0x003d
        L_0x005f:
            java.lang.String r0 = "has_lyrics"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r5)
            r3.A00 = r0
            goto L_0x005b
        L_0x006e:
            java.lang.String r0 = "is_explicit"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            boolean r0 = r5.A0d()
            r3.A0N = r0
            goto L_0x005b
        L_0x007d:
            java.lang.String r0 = "allows_saving"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            boolean r0 = r5.A0d()
            r3.A0M = r0
            goto L_0x005b
        L_0x008c:
            java.lang.String r0 = "is_eligible_for_audio_effects"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r5)
            r3.A01 = r0
            goto L_0x005b
        L_0x009b:
            java.lang.String r0 = "progressive_download_url"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0F = r0
            goto L_0x005b
        L_0x00aa:
            java.lang.String r0 = "ig_username"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0E = r0
            goto L_0x005b
        L_0x00b9:
            java.lang.String r0 = "display_artist"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0B = r0
            goto L_0x005b
        L_0x00c8:
            java.lang.String r0 = "dash_manifest"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0A = r0
            goto L_0x005b
        L_0x00d7:
            java.lang.String r0 = "audio_cluster_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A06 = r0
            goto L_0x005b
        L_0x00e7:
            java.lang.String r0 = "sanitized_title"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0H = r0
            goto L_0x005b
        L_0x00f7:
            java.lang.String r0 = "fast_start_progressive_download_url"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0C = r0
            goto L_0x005b
        L_0x0107:
            java.lang.String r0 = "artist_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A04 = r0
            goto L_0x005b
        L_0x0117:
            r0 = 25
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0G = r0
            goto L_0x005b
        L_0x012b:
            java.lang.String r0 = "title"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0J = r0
            goto L_0x005b
        L_0x013b:
            java.lang.String r0 = "duration_in_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r5)
            r3.A03 = r0
            goto L_0x005b
        L_0x014b:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x005b
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x005b
            r3.A0D = r0
            goto L_0x005b
        L_0x0165:
            java.lang.String r0 = "cover_artwork_thumbnail_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A07 = r0
            goto L_0x005b
        L_0x0175:
            java.lang.String r0 = "cover_artwork_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A08 = r0
            goto L_0x005b
        L_0x0185:
            java.lang.String r0 = "dark_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A09 = r0
            goto L_0x005b
        L_0x0195:
            java.lang.String r0 = "web_30s_preview_download_url"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0K = r0
            goto L_0x005b
        L_0x01a5:
            java.lang.String r0 = "is_eligible_for_vinyl_sticker"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r5)
            r3.A02 = r0
            goto L_0x005b
        L_0x01b5:
            java.lang.String r0 = "highlight_start_times_in_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x01da
        L_0x01ca:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x01da
            int r0 = r5.A1D()
            X.AnonymousClass7TF.A1M(r2, r0)
            goto L_0x01ca
        L_0x01da:
            r3.A0L = r2
            goto L_0x005b
        L_0x01de:
            java.lang.String r0 = "subtitle"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A0I = r0
            goto L_0x005b
        L_0x01ee:
            java.lang.String r0 = "audio_asset_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C13989Tnp.A0o(r5)
            r3.A05 = r0
            goto L_0x005b
        L_0x01fe:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0203:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19245WRe.invoke(X.16F):java.lang.Object");
    }
}
