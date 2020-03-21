package gl51.service.lmpl

import gl51.data.Picture
import gl51.service.FetchService
import gl51.service.FiligraneService
import gl51.service.RedimensionService

import javax.inject.Inject

@Singleton
class Redimensionlmpl implements RedimensionService{
    @Inject FetchService fetchService

    Picture redimension() {

        Picture picture = fetchService.fetch()
        picture.px_x(1024)
        picture.px_y(1024)
        return picture



    }
}
