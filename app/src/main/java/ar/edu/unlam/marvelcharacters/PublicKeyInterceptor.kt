package ar.edu.unlam.marvelcharacters

import okhttp3.Interceptor
import okhttp3.Response

class PublicKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val url = request.url()

        val newUrl = url.newBuilder().addQueryParameter("apikey", BuildConfig.PUBLIC_KEY).build()

        return chain.proceed(request.newBuilder().url(newUrl).build())
    }
}